import axios from 'axios'

export const getRequset = (url, param) => {
  return axios({
    url: url,
    method: 'get',
    data: param
  })
}
export const postRequset = (url, param) => {
  return axios({
    url: url,
    method: 'post',
    data: param
  })
}
