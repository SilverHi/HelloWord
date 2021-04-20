<template>
  <div>
    <el-row>
      <el-col :span="20" :offset="2" >
        <input class = "loginInput" placeholder="请输入中文" v-model="chinese"/>
      </el-col>
    </el-row>
    <el-row style="margin-top: 10px;">
      <el-col :span="20" :offset="2" >
        <input class = "loginInput"  placeholder="请输入日语" v-model="foreign"/>
      </el-col>
    </el-row>
    <el-row style="margin-top: 20px;">
      <el-col :span="20" :offset="2">
        <el-button type="primary" @click="login" round class="submitBtn">下一个</el-button>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import {translation} from '../../request/api'

export default {
  name: 'WrittenWord',
  data () {
    return {
      chinese: '',
      foreign: ''
    }
  },
  methods: {
    login () {
      // if (!this.username) {
      //   this.$message({
      //     message: '没填用户名是不可以的哦~',
      //     center: true,
      //     type: 'info'
      //   })
      //   return
      // }
      // if (!this.password) {
      //   this.$message({
      //     message: '没填密码是不可以的哦~',
      //     center: true,
      //     type: 'info'
      //   })
      //   return
      // }
      translation({type: '1aaa', word: this.chinese}).then(res => {
        console.log(res)
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
