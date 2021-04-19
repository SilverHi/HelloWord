<template>
  <div>你好 欢迎{{user.nickName}}</div>
</template>

<script>

import {checkUser} from '../../request/api'

export default {
  name: 'home',
  data () {
    return {
      user: this.$store.state.user
    }
  },
  created () {
  },
  mounted () {
    // console.log(this.$store.state.token)
    checkUser()
  }
}
</script>
