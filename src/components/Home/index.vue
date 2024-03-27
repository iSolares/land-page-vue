<template>
  <div class="h-100 w-100">
    <v-row>
      <v-col cols="12">
        <v-img
          eager
          cover
          class="w-100 position-absolute"
          src="../../assets/img/iniciodapagina.png"
        />
        <v-img
          eager
          width="100%"
          class=" size-init-title"
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
            cover
            src="../../assets/img/carrossel1.png"
          ></v-carousel-item>
          <v-carousel-item
            cover
            eager
            src="../../assets/img/carrossel2.png"
          ></v-carousel-item>
          <v-carousel-item
            eager
            cover
            src="../../assets/img/carrossel3.png"
          ></v-carousel-item>
          <v-carousel-item
            eager
            cover
            src="../../assets/img/carrossel4.png"
          ></v-carousel-item>
          <v-carousel-item
            eager
            cover
            src="../../assets/img/carrossel5.png"
          ></v-carousel-item>
          <v-carousel-item
            eager
            cover
            src="../../assets/img/carrossel6.png"
          ></v-carousel-item>
          <v-carousel-item
            eager
            cover
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
    <v-row class="w-100">
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
          <l-map
            ref="map"
            v-model:zoom="zoom"
            m
            :center="[-12.98995518060895, -38.45681316447221]"
          >
            <l-tile-layer
              url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
              layer-type="base"
              name="OpenStreetMap"
            ></l-tile-layer>
          </l-map>
        </div>
      </v-col>
      <v-col cols="12">
        <v-img eager height="100" src="../../assets/img/endereçopromapa.png" />
      </v-col>
    </v-row>
    <v-row>
      <v-col class="pa-0" cols="12">
        <v-img
          cover
          eager
          class="align-center"
          src="../../assets/img/fundofaçasuareserva.png"
        >
          <v-row>
            <v-col cols="12">
              <v-img
                cover
                eager
                src="../../assets/img/façasuareservatitulo.png"
              />
              <v-img
                eager
                height="100"
                src="../../assets/img/entreemcontatobotao.png"
              />
            </v-col>
          </v-row>
        </v-img>
      </v-col>
    </v-row>
    <v-row>
      <v-col class="pa-0" cols="12">
        <v-img class="d-flex align-center" src="../../assets/img/finaldepáginafundobranco.png">
          <v-col
            class="d-flex justify-center justify-space-evenly flex-row"
            cols="12"
          >
            <v-col class="pa-0 my-auto" cols="3">
              <v-img
              cover
                height="465"
                src="../../assets/img/finaldepaginaperfiljoks.png"
              />
            </v-col>
            <v-col class="my-auto pb-16" cols="3">
              <v-img
                cover
                width="300"
                eager
                class="mb-16"
                src="../../assets/img/finaldepaginajokstitulo.png"
              />
              <v-img
                cover
                eager
                class="mt-7 mb-10"
                width="200"
                src="../../assets/img/finaldepaginanos.png"
              />
              <v-img
                cover
                width="300"
                eager
                class="mb-10"
                src="../../assets/img/finaldepagianhorário.png"
              />
              <v-img
                width="200"
                cover
                eager
                class="mb-10"
                src="../../assets/img/finaldepaginafeedback.png"
              />
              <v-img
              width="250"
              eager
              cover
              src="../../assets/img/finaldepaginalocal.png"
              
            />
            </v-col>
            <v-col class="my-auto" cols="3">
              <v-img
                eager
                height="50"
                src="../../assets/img/finaldepaginainsta.png"
              />
            </v-col>
          </v-col>
        </v-img>
      </v-col>
    </v-row>
  </div>
</template>

<script setup lang="ts">
import "leaflet/dist/leaflet.css";
import { LMap, LTileLayer } from "@vue-leaflet/vue-leaflet";
import { ref } from "vue";
const zoom = ref(18);
</script>
<style>
#map {
  margin-left: auto;
  margin-right: auto;
  width: 1400px;
  height: 600px;
}
.size-init-title {
  margin-top: 70vh;
}

.position-arrow-left {
  margin-top: 1px;
  margin-left: 1vh;
}

.position-arrow-right {
  margin-left: 10.1vh;
}

.center {
  margin-top: auto;
  margin-bottom: auto;
}
</style>
