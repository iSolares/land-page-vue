<template>
    <div class="h-100 w-100">
        <v-img class="w-100 position-absolute" src="../../assets/img/iniciodapagina.png"/>
            <v-img class="w-100 size-init-title" src="../../assets/img/iniciodapaginatitulo.png"/>
      <v-row>
          <v-col cols="12">
        <v-carousel
          height="500"
          show-arrows="hover"
          cycle
          interval="3000"
          hide-delimiter-background
        >
          <v-carousel-item sizes="1000" src="../../assets/img/carrossel1.png">
          </v-carousel-item>
          <v-carousel-item src="../../assets/img/carrossel2.png">
          </v-carousel-item>
          <v-carousel-item src="../../assets/img/carrossel3.png">
          </v-carousel-item>
          <v-carousel-item src="../../assets/img/carrossel4.png">
          </v-carousel-item>
          <v-carousel-item src="../../assets/img/carrossel5.png">
          </v-carousel-item>
          <v-carousel-item src="../../assets/img/carrossel6.png">
          </v-carousel-item>
          <v-carousel-item src="../../assets/img/carrossel7.png">
          </v-carousel-item>
        </v-carousel>
      </v-col>
    </v-row>
</div>

</template>

<script setup lang="ts">
import { ref } from "vue";
const items = ref([
    {
        src:'../../assets/img/carrossel1.png'
    },
    {
        src:"../../assets/img/carrossel2.png"
    },
    {
        src:"../../assets/img/carrossel3.png"
    },
    {
        src:"../../assets/img/carrossel4.png"
    },
    {
        src:"../../assets/img/carrossel5.png"
    },
    {
        src:"../../assets/img/carrossel6.png"
    },
    {
        src:"../../assets/img/carrossel7.png"
    },
   
]);

</script>
<style scoped>
.size-init-title {
    padding-top: 500px ;
}

</style>
