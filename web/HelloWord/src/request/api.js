import {getRequset, postRequset} from './http'

export const login = p => postRequset('/user/login', p)

export const translation = p => postRequset('/wrod/translation', p)

export const checkUser = p => postRequset('/wrod/translation')
