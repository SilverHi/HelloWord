import instance from './request'
import Qs from 'qs'
export const getRequset = (url, param) => {
  return instance({
    url: url,
    method: 'get',
    data: Qs.stringify(param)
  })
}
export const postRequset = (url, param) => {
  return instance({
    url: url,
    method: 'post',
    data: Qs.stringify(param)
  })
}
