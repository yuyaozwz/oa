<template>
  <div>
    <Row class="header">
      <img src="../../assets/logo.png" width="220px">
      <div class="description">基于Vue和Springboot的OA协同系统</div>
    </Row>
  </div>
</template>

<script>
export default {
  name: "header"
};
</script>

<style lang="less">
.header {
  margin-top: 8vh;
  margin-bottom: 5vh;
  text-align: center;

  .description {
    font-size: 22px;
    color: rgba(0, 0, 0, 0.55);
    margin-top: 1vh;
  }
}
</style>
