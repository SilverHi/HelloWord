import Vue from 'vue'

import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({

  state: {
    // 这里放全局参数
    token: '',
    user: []
  },
  mutations: {
    // 这里是set方法
    setToken (state, token) {
      state.token = token
    },
    setUser (state, user) {
      state.user = user
    }
  },
  getters: {
    // get方法
    getToken: state => state.token,
    getUser: state => state.user
  },

  actions: {
    // 这个部分我暂时用不上
  },
  modules: {
    // 这里是我自己理解的是为了给全局变量分组，所以需要写提前声明其他store文件，然后引入这里
  }
})
