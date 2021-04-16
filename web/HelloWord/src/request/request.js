import axios from 'axios'
import Cookies from 'js-cookie'

let instance = axios.create({
  headers: {'content-type': 'application/json', 'Authorization': Cookies.get('Authorization')}
})

instance.defaults.baseURL = ''
instance.defaults.withCredentials = true

// 添加请求拦截器
instance.interceptors.request.use(function (config) {
  // 在发送请求之前做些什么
  config.headers.channelToken = Cookies.get('channelToken')
  return config
}, function (error) {
  // 对请求错误做些什么
  return Promise.reject(error)
})

// 添加响应拦截器
instance.interceptors.response.use(function (response) {
  // 对响应数据做点什么
  if (response.status === '200') {
    if (response.data.code === '1001') {
      const loginUrl = Cookies.get('sysUrl')
      Cookies.remove('userName', { domain: 'abc.com' })
      Cookies.remove('token', { domain: 'abc.com' })
      localStorage.clear()
      window.location.href = loginUrl
    }
  }
  return response.data
}, function (error) {
  // 对响应错误做点什么
  console.log('--- 401 res error response ---')
  console.log(error.response)
  if (error && error.response && error.response.status === '401') {
    const loginUrl = Cookies.get('sysUrl')
    Cookies.remove('userName', { domain: 'abc.com' })
    Cookies.remove('token', { domain: 'abc.com' })
    localStorage.clear()
    window.location.href = loginUrl
  }
  return Promise.reject(error)
})

export default instance
