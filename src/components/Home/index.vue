<template>
  <v-container class="d-flex flex-column px-0 w-100">
      <p class="text-center">
        Lorem ipsum, dolor sit amet consectetur adipisicing elit. Mollitia eaque
        illum officiis magni commodi tenetur quos assumenda fuga hic, accusantium,
        cupiditate cumque minima earum quia deserunt quidem itaque quaerat amet?
      </p>
      <v-row>
          <v-col cols="12">
        <v-carousel
          height="500"
          show-arrows="hover"
          cycle
          interval="3000"
          hide-delimiter-background
        >
          <v-carousel-item v-for="(slide, i) in slides" :key="i">
            <v-sheet :color="colors[i]" height="100%" width="100%">
              <div class="d-flex fill-height justify-center align-center">
                <div class="text-h2">{{ slide }} Slide</div>
              </div>
            </v-sheet>
          </v-carousel-item>
        </v-carousel>
      </v-col>
    </v-row>
  </v-container>
</template>

<script setup lang="ts">
import { ref } from "vue";
const slides: string[] = ref(["First", "Second", "Third", "Fourth", "Fifth"]);
const colors: string[] = ref([
  "indigo",
  "warning",
  "pink darken-2",
  "red lighten-1",
  "deep-purple accent-4",
]);
</script>
<style scoped>

</style>
