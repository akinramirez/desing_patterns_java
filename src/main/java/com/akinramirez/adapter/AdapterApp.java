package com.akinramirez.adapter;
/**
 * Esta clase no hace parte de la estructura del patrón, pero es importante porque nos permite ver como se configuran
 * los objetos.
 */
class AdapterApp {

    public static void main(String[] args) {

        //Creamos el adaptador.
        EmailSender sender = new SparkPosAdapter();

        //Inyectamos el adaptador al cliente.
        AdapterClient client = new AdapterClient(sender);

        //Probemos si funciona correctamente.
        client.execute();
    }

}
