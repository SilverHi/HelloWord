<template>
  <div>首页</div>
</template>

<script>

import {checkUser} from '../../request/api'

export default {
  name: 'home',
  data () {
    return {
      user: {}
    }
  },
  created () {
    checkUser()
  },
  mounted () {
    // console.log(this.$store.state.token)
  }
}
</script>
