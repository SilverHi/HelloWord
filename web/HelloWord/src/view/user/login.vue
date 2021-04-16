<template>
  <div>
    <el-row style="margin-top: 40%">
      <el-col :span="12" :offset="6" ><h1 style="text-align: center">你好</h1></el-col>
    </el-row>
    <el-row>
      <el-col :span="12" :offset="6" >
        <svg class = "icon" aria-hidden="true">
          <use xlink:href="#el-iconmi_ma"></use>
        </svg>
        <el-input prefix-icon="el-iconmi_ma iconfont"></el-input>
      </el-col>
    </el-row>
    <el-row>
      <el-col :span="12" :offset="6" ><h1 style="text-align: center">你好</h1></el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  name: 'login',
  data () {
    return {
      value: true
    }
  }
}
</script>

<style>
</style>
