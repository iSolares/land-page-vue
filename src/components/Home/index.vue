<template>
  <div class="h-100 w-100">
    <v-row>
      <v-col cols="12">
        <v-img
          eager
          class="w-100 position-absolute"
          src="../../assets/img/iniciodapagina.png"
        />
        <v-img
          eager
          class="w-100 size-init-title"
          src="../../assets/img/iniciodapaginatitulo.png"
        />
      </v-col>
    </v-row>

    <v-row>
      <v-col cols="12">
        <v-carousel
          height="100%"
          show-arrows="hover"
          cycle
          interval="3000"
          hide-delimiters
        >
          <v-carousel-item
            eager
            src="../../assets/img/carrossel1.png"
          ></v-carousel-item>
          <v-carousel-item
            eager
            src="../../assets/img/carrossel2.png"
          ></v-carousel-item>
          <v-carousel-item
            eager
            src="../../assets/img/carrossel3.png"
          ></v-carousel-item>
          <v-carousel-item
            eager
            src="../../assets/img/carrossel4.png"
          ></v-carousel-item>
          <v-carousel-item
            eager
            src="../../assets/img/carrossel5.png"
          ></v-carousel-item>
          <v-carousel-item
            eager
            src="../../assets/img/carrossel6.png"
          ></v-carousel-item>
          <v-carousel-item
            eager
            src="../../assets/img/carrossel7.png"
          ></v-carousel-item>
        </v-carousel>
      </v-col>
    </v-row>
    <v-row>
      <v-col cols="12">
        <v-img
          eager
          cover
          class="w-100 h-100"
          src="../../assets/img/horariodefuncionamentofundo.png"
        >
          <v-row class="my-16">
            <v-col cols="6">
              <v-img
                cover
                eager
                class="h-100 w-100"
                height="1600"
                src="../../assets/img/coringahorario.png"
              >
              </v-img>
            </v-col>
            <v-col class="flex-column" cols="6">
              <v-img eager src="../../assets/img/horariotitulo.png" />
              <v-img
                eager
                class="mx-auto"
                src="../../assets/img/horáriosedias.png"
              />
              <v-img
                eager
                class="justify-end"
                src="../../assets/img/duvidastitulo.png"
              />
              <v-img
                eager
                class="justify-end"
                src="../../assets/img/duvidas.png"
              />
            </v-col>
          </v-row>
        </v-img>
      </v-col>
    </v-row>
    <v-row>
      <v-col class="pa-0" cols="2">
        <v-img
          height="700"
          width="220"
          eager
          class="position-arrow-left"
          src="../../assets/img/cantoporquereservar.png"
        />
      </v-col>
      <v-col class="pa-0" cols="8">
        <v-img eager src="../../assets/img/reservatitulo.png" />
        <v-img eager src="../../assets/img/precisareservar_texto.png" />
      </v-col>
      <v-col class="pa-0" cols="2">
        <v-img
          height="700"
          width="220"
          eager
          class="position-arrow-right d-flex justify-end"
          src="../../assets/img/precisareservarcanto.png"
        />
      </v-col>
    </v-row>
    <v-row>
      <v-col cols="12">
        <img width="100%" src="../../assets/img/sobrenostitulo.png" />
      </v-col>
      <v-col cols="12">
        <v-img eager src="../../assets/img/sobreajoksquadros.png" />
      </v-col>
    </v-row>
    <v-row>
      <v-col cols="12">
        <v-img eager src="../../assets/img/botaoporquevir.png" />
      </v-col>
      <v-col cols="12">
        <v-img eager src="../../assets/img/motivos.png" />
      </v-col>
    </v-row>
    <v-row>
      <v-col cols="12">
        <v-img eager src="../../assets/img/feedback.png" />
      </v-col>
      <v-col cols="12">
        <v-img eager src="../../assets/img/feedbackcliente1.png" />
      </v-col>
      <v-col cols="12">
        <v-img eager src="../../assets/img/feedbackcliente3.png" />
      </v-col>
      <v-col cols="12">
        <v-img eager src="../../assets/img/feedbackcliente2.png" />
      </v-col>
    </v-row>
    <v-row>
      <v-col cols="12">
        <v-img eager src="../../assets/img/localizaçãobotao.png" />
      </v-col>
      <v-col cols="12">
        <div id="map">
          <l-map ref="map" v-model:zoom="zoom" :center="[47.41322, -1.219482]">
            <l-tile-layer
              url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
              layer-type="base"
              name="OpenStreetMap"
            ></l-tile-layer>
          </l-map>
        </div>
      </v-col>
    </v-row>
  </div>
</template>

<script setup lang="ts">
import "leaflet/dist/leaflet.css";
import { LMap, LTileLayer } from "@vue-leaflet/vue-leaflet";
import { ref } from "vue";

const zoom = ref(2);
</script>
<style scoped>
#map {
  margin-left: auto;
  margin-right: auto;
  width: 1400px;
  height: 400px;
  margin-bottom: 100px;
}
.size-init-title {
  padding-top: 1100px;
}

.position-arrow-left {
  margin-top: 1px;
  margin-left: 1vh;
}

.position-arrow-right {
  margin-left: 10vh;
}
</style>
