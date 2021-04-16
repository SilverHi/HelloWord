import instance from './request'

export const getRequset = (url, param) => {
  return instance({
    url: url,
    method: 'get',
    data: param
  })
}
export const postRequset = (url, param) => {
  return instance({
    url: url,
    method: 'post',
    data: param
  })
}
