<template>
  <v-app>
  <div class="h-100 style-background">
    <v-main>
      <router-view />
    </v-main>
  </div>
  </v-app>
</template>

<script lang="ts" setup>
  //
</script>

<style>
.style-background, body {
  background-color: grey;
}
</style>
