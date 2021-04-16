import {getRequset, postRequset} from './http'

export const login = p => postRequset('/user/login', p)

export const checkUser = p => getRequset('/user/checkUser')
