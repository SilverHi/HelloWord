import Vue from 'vue'
import Router from 'vue-router'
import Home from '../view/home/Home'
import login from '../view/user/Login'
import WrittenWord from '../view/word/WrittenWord'

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
    },
    {
      path: '/word/written',
      name: 'written',
      component: WrittenWord
    }
  ]
})
