import axios from 'axios'
import Cookies from 'js-cookie'
import store from '../store/index'
import router from '../router/index'

let instance = axios.create({
  headers: {'content-type': 'application/json', 'Authorization': Cookies.get('Authorization')}
})

instance.defaults.baseURL = ''
instance.defaults.withCredentials = true

// 添加请求拦截器
instance.interceptors.request.use(config => {
  // 在发送请求之前做些什么
  config.headers.token = store.state.token
  return config
}, (error) => {
  // 对请求错误做些什么
  return Promise.reject(error)
})

// 添加响应拦截器
instance.interceptors.response.use(response => {
  // 对响应数据做点什么
  if (response.status === '200') {
    // todo
  }
  return response.data
}, error => {
  switch (error.response.status) {
    case 404:
      // todo
      break
    // eslint-disable-next-line no-fallthrough
    case 403:
      router.replace({
        path: '/login',
        query: {
          redirect: router.currentRoute.fullPath
        }
      })
      break
  }
})

export default instance
