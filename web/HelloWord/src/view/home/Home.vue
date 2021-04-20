<template>
  <div class = "s-container">
    <el-row class = "s-header">快乐背单词</el-row>
    <el-row class = "s-main">
      <el-button type="primary" @click="handwrittenWords" round class="submitBtn">手抄单词</el-button>
    </el-row>
    <el-row class = "s-footer">111</el-row>
  </div>
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
    checkUser()
  },
  methods: {
    handwrittenWords () {
      this.$router.push('/word/written')
    }
  }
}
</script>
