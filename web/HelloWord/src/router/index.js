import Vue from 'vue'
import Router from 'vue-router'
import Home from '../view/home/Home'
import login from '../view/user/login'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/login',
      name: 'login',
      component: login
    }
  ]
})
