import {getRequset, postRequset} from './http'

export const login = p => getRequset('/user/login', p)

export const login2 = p => postRequset('/user/login', p)
