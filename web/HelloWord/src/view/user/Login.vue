<template>
  <div>
    <el-row style="margin-top: 40%;width: 100%">
      <el-col :span="12" :offset="2" ><h1 style="text-align: left">登录</h1></el-col>
    </el-row>
    <el-row>
      <el-col :span="20" :offset="2" >
        <input class = "loginInput" placeholder="请输入账号" v-model="username"/>
      </el-col>
    </el-row>
    <el-row style="margin-top: 10px;">
      <el-col :span="20" :offset="2" >
        <input class = "loginInput" type="password" placeholder="请输入密码" v-model="password"/>
      </el-col>
    </el-row>
    <el-row style="margin-top: 20px;">
      <el-col :span="20" :offset="2">
        <el-button type="primary" @click="login" round class="submitBtn">确定</el-button>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import {login} from '../../request/api'

export default {
  name: 'Login',
  data () {
    return {
      username: '',
      password: '',
      value: true
    }
  },
  methods: {
    login () {
      if (!this.username) {
        this.$message({
          message: '没填用户名是不可以的哦~',
          center: true,
          type: 'info'
        })
        return
      }
      if (!this.password) {
        this.$message({
          message: '没填密码是不可以的哦~',
          center: true,
          type: 'info'
        })
        return
      }
      login({username: this.username, password: this.password}).then(res => {
        if (res.code === 200) {
          console.log(res)
          this.$store.commit('setToken', res.data.token)
          this.$store.commit('setUser', res.data.user)
          this.$message({
            message: '登录成功啦~',
            center: true,
            type: 'success'
          })
          this.$router.push('/')
        } else {
          this.$message({
            message: res.message,
            center: true,
            type: 'error'
          })
        }
      })
    }
  }
}
</script>

<style >
::-webkit-input-placeholder { /* WebKit browsers */
  color: #bcb5b5;
  font-size: 14px;
}
.loginInput{
  height: 40px;
  border: 0;
  outline: none;
  background-color: rgba(0, 0, 0, 0);
  border-bottom: 2px solid;
  border-bottom-color: #8080805c;
  width: 100%;
  font-size: 30px;
  caret-color: #cabdbd;
}
.submitBtn{
  margin-top: 20px;
  width: 100%;
}
</style>
