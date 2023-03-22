package ingui.javafx.clab_criptomonedas_navegador_web;

import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_delete;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_insert;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_jdbc_servidor_http_spring_clave;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_jdbc_servidor_http_spring_conexion;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_jdbc_servidor_http_spring_driver;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_jdbc_servidor_http_spring_url;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_jdbc_servidor_http_spring_usuario;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_letras_por_linea;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_select;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_select_columnas_cabecera_tex;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_select_columnas_tex;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_select_count;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_select_pagina_tam;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_clab_criptomonedas_update;
import static ingui.javafx.clab_criptomonedas_navegador_web.Clab_criptomonedas.k_valores_mapa_info_tabla_tex;
import ingui.javafx.navegador_web.Navegador_web;
import innui.modelos.configuraciones.ResourceBundles;
import innui.modelos.configuraciones.Resources;
import innui.modelos.configuraciones.iniciales;
import innui.modelos.errores.oks;
import innui.modelos.internacionalizacion.tr;
import innui.modelos.modelos;
import innui.modelos.modelos_comunicaciones.modelos_comunicaciones;
import inweb.modelos_html.formularios.web_formularios;
import static inweb.modelos_html.formularios.web_formularios.k_nombre_fragmento;
import static inweb.modelos_html.formularios.web_formularios.k_valores_mapa_url_destino_tex;
import inweb.modelos_html.modelos_html;
import java.io.InputStream;
import static java.lang.System.err;
import static java.lang.System.exit;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author emilio
 */
public class Clab_criptomonedas_navegador_web extends Navegador_web {
    public static String k_in_ruta = "in/ingui/javafx/clab_criptomonedas_navegador_web/in";
    public static String k_icono_ruta = "/re/static/ingui.javafx.clab_criptomonedas_navegador_web.png";
    public static String k_imagen_cabecera_ruta = "/re/static/ingui.javafx.clab_criptomonedas_navegador_web.cripto_y_mas.png";
    public static String k_index_ruta = "/re/templates/formulario_simple/index.html";
    public static String k_clab_criptomonedas_inicio_url = "https://localhost";
    public static String k_clab_criptomonedas_index_html = "/clab_criptomonedas/index_html";
    public static String k_opcion_nombre_fragmento_html = "html";
    public static String k_clave_index = "index";
    public static String k_titulo_tex = "titulo_tex";
    public static String k_mensaje_imagen_tex = "mensaje_imagen_tex";
    public static String k_imagen_ruta_tex = "imagen_ruta_tex";
    public static String k_mensaje_cabecera_tex = "mensaje_cabecera_tex";
    public static String k_formulario_tex = "formulario_tex";
    public static String k_fragmentos_principales_ruta = "/re/templates/formularios/fragmentos/fragmentos_principales.html";
    public web_formularios index = new web_formularios();
    public Map <String, String> index_valores_mapa = new HashMap<>();
    public Map <String, Object> lecturas_web_formulario_opciones_mapa = new HashMap<>();   
    public Clab_criptomonedas clab_criptomonedas = new Clab_criptomonedas();
    public iniciales inicial = new iniciales () {
        @Override
        public boolean run(oks ok, Object... extra_array) throws Exception {
            try {
                iniciar(ok);                
                if (ok.es) { 
                    if (extra_array.length > 1 
                    && (Boolean) extra_array[1]) {
                        Clab_criptomonedas_navegador_web.super.inicial.run(ok, Clab_criptomonedas_navegador_web.class, extra_array[0]);
                    }
                    oks ok_fin = new oks();
                    terminar(ok_fin);
                    if (ok_fin.es == false) {
                        ok.setTxt(ok.getTxt(), ok_fin.getTxt());
                    }
                }
                return ok.es;
            } catch (Exception e) {
                throw e;
            }
        }

        @Override
        public boolean iniciar(oks ok, Object... extra_array) throws Exception {
            if (ok.es == false) { return ok.es; }
            _iniciar_desde_clase(modelos.class, ok);
            if (ok.es == false) { return ok.es; }
            _iniciar_desde_clase(modelos_html.class, ok);
            if (ok.es == false) { return ok.es; }
            _iniciar_desde_clase(modelos_comunicaciones.class, ok);
            if (ok.es == false) { return ok.es; }
            _iniciar_desde_clase(Navegador_web.class, ok);
            if (ok.es == false) { return ok.es; }
            _iniciar_desde_clase(this.getClass(), ok);
            if (ok.es == false) { return ok.es; }
            return ok.es;
        }

        @Override
        public boolean terminar(oks ok, Object... extra_array) throws Exception {
            if (ok.es == false) { return ok.es; }
            _terminar_desde_clase(modelos.class, ok);
            if (ok.es == false) { return ok.es; }
            _terminar_desde_clase(modelos_html.class, ok);
            if (ok.es == false) { return ok.es; }
            _terminar_desde_clase(modelos_comunicaciones.class, ok);
            if (ok.es == false) { return ok.es; }
            _terminar_desde_clase(Navegador_web.class, ok);
            if (ok.es == false) { return ok.es; }
            _terminar_desde_clase(this.getClass(), ok);
            if (ok.es == false) { return ok.es; }
            return ok.es;
        }
        
        @Override
        public boolean escribir_linea_error(String mensaje, oks ok, Object ... extras_array) {
            boolean ret = true;
            if (_contenedor_principalController != null) {
                ret = _contenedor_principalController.poner_error(mensaje, ok);
            }
            err.printf(ok.txt);
            return ret;
        }    
    };

    public Clab_criptomonedas_navegador_web() throws Exception {        
    }
    
    public static void main(String[] args) {
        oks ok = new oks();
        Clab_criptomonedas_navegador_web clab_criptomonedas_navegador_web = null;
        try {
            clab_criptomonedas_navegador_web = new Clab_criptomonedas_navegador_web();
            Object [] extra_array = { args
            , true };
            clab_criptomonedas_navegador_web.inicial.run(ok, extra_array);
        } catch (Exception e) {
            ok.setTxt(e);
        }
        if (ok.es == false) {
            System.err.println(ok.txt);
            exit(1);
        } else {
            exit(0);
        }
    }
    /**
     * Realiza la operativa de navegar para presentar una página web
     * @param parametros_lista
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    @Override
    public boolean navegar(List<String> parametros_lista, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        inicial.iniciar(ok, extra_array);
        if (ok.es) {
            while (true) {
                configurar(ok);
                if (ok.es == false) { break; }
                clab_criptomonedas.crear_formulario_lectura(ok);
                if (ok.es == false) { break; }
                clab_criptomonedas.crear_formulario_insercion(ok);
                if (ok.es == false) { break; }
                clab_criptomonedas.crear_formulario_borrado(ok);
                if (ok.es == false) { break; }
                clab_criptomonedas.crear_formulario_actualizar(ok);
                if (ok.es == false) { break; }
                Map <String, String> valores_mapa = new HashMap<>();
                capturar_lecturas_web_formulario(valores_mapa, 0, ok);
                if (ok.es == false) { break; }
                construir_formulario_index(ok);
                if (ok.es == false) { break; }
                capturar_formulario_index(index_valores_mapa, ok);
                break;
            }
            oks ok_fin = new oks();
            inicial.terminar(ok_fin);
            if (ok_fin.es == false) {
                ok.setTxt(ok.getTxt(), ok_fin.getTxt());
            }
        }
        return ok.es;
    }
    /**
     * Pone el icono de la aplicación
     * @param stage Escenario donde poner el icono
     * @param ok
     * @param extra_array
     * @return true si tiene éxito, false si hay error.
     * @throws java.lang.Exception
     */
    @Override
    public boolean poner_icono(Stage stage, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ObservableList<Image> observableList = stage.getIcons();
        InputStream inputStream = this.getClass().getResourceAsStream(
            k_icono_ruta); 
        Image image = new Image(inputStream);
        observableList.add(image);
        return ok.es;
    }
    public boolean capturar_lecturas_web_formulario(Map <String, String> valores_mapa, long fila_inicio_pagina, oks ok, Object... extra_array) throws Exception {
        ResourceBundle in;
        try {
            if (ok.es == false) { return ok.es; }
            Long filas_cuenta;
            String info_tabla;
            in = ResourceBundles.getBundle(k_in_ruta);
            filas_cuenta = clab_criptomonedas.leer_cuenta_filas_criptomonedas(fila_inicio_pagina, ok);
            if (ok.es == false) { return false; }
            clab_criptomonedas.leer_pagina_criptomonedas(fila_inicio_pagina, ok);
            if (ok.es == false) { return false; }
            info_tabla = tr.in(in, "Presentando fila ") 
            + (fila_inicio_pagina + 1) 
            + tr.in(in, " de ") + filas_cuenta;
            valores_mapa.put(k_valores_mapa_url_destino_tex, k_clab_criptomonedas_inicio_url + k_clab_criptomonedas_index_html);
            valores_mapa.put(k_valores_mapa_info_tabla_tex, info_tabla);
            clab_criptomonedas.lectura_web_formulario.iniciar(k_fragmentos_principales_ruta, valores_mapa, null, ok);
            if (ok.es == false) { return ok.es; }
            clab_criptomonedas.lectura_web_formulario.capturar(ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }    
    public boolean construir_formulario_index(oks ok, Object... extra_array) throws Exception {
        ResourceBundle in;
        in = ResourceBundles.getBundle(k_in_ruta);
        try {
            if (ok.es == false) { return ok.es; }
            index.iniciar(k_index_ruta, index_valores_mapa, null, ok);
            if (ok.es == false) { return ok.es; }
            lecturas_web_formulario_opciones_mapa.put(k_nombre_fragmento, k_opcion_nombre_fragmento_html);
            index_valores_mapa.clear();
            index_valores_mapa.put(k_titulo_tex, tr.in(in, "Formulario simple navegador web"));
            index_valores_mapa.put(k_mensaje_imagen_tex, k_imagen_cabecera_ruta);
            URL imagen_url;
            imagen_url = Resources.getResource(k_imagen_cabecera_ruta);
            index_valores_mapa.put(k_imagen_ruta_tex, "file://" + imagen_url.getPath());
            index_valores_mapa.put(k_mensaje_cabecera_tex, tr.in(in, "CLAB Criptomonedas navegador web "));
            index_valores_mapa.put(k_formulario_tex, clab_criptomonedas.lectura_web_formulario.getContenido_formulario_html());
            inweb.modelos_html.formularios.control_textos control_texto = new inweb.modelos_html.formularios.control_textos();
            if (ok.es == false) { return ok.es; }
            control_texto.poner_en_formulario(index, k_clave_index, index_valores_mapa, null, lecturas_web_formulario_opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }    
    public boolean capturar_formulario_index(Map <String, String> valores_mapa, oks ok, Object... extra_array) throws Exception {
        ResourceBundle in;
        in = ResourceBundles.getBundle(k_in_ruta);
        try {
            if (ok.es == false) { return ok.es; }
            index.iniciar(k_index_ruta, valores_mapa, null, ok);
            if (ok.es == false) { return ok.es; }
            index.capturar(ok);
            if (ok.es == false) { return ok.es; }
            webview_simpleController_implementacion.presentar_contenido(index.getContenido_formulario_html(), ok);
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }    
    /**
     * Captura las URLs que son llamadas (clic) en el navegador 
     * @param url
     * @param ok
     * @param extras_array
     * @return true si todo es correcto, false/null si hay error.
     * @throws Exception 
     */
    @Override
    public Boolean procesar_evento_llamada_a_url(URL url, oks ok, Object ... extras_array) throws Exception {
//        return procesar_formulario(url, ok, extras_array);
        return ok.es;
    }
    
//    public boolean procesar_formulario(URL url, oks ok, Object ... extras_array) throws Exception {
//        ResourceBundle in;
//        try {
//            if (ok.es == false) { return ok.es; }
//            Map<String, String> datos_mapa = new LinkedHashMap<>();
//            if (url.getPath().endsWith(k_clab_criptomonedas_index_html)) {
//                urls.extraer_parametros_query(url, datos_mapa, ok);
//                if (ok.es == false) { return ok.es; }
//                String clave, valor;
//                List<Entry<String, Object>> formulario_simple_claves_valor_lista = new LinkedList<>();
//                Entry<String, Object> nueva_entrada;
//                for(Entry<String, String> entry: datos_mapa.entrySet()) {
//                    clave = entry.getKey();
//                    valor = entry.getValue();
//                    clave = clave.replaceAll("^\\.+\\[\\s*\\d+\\s*\\]$", "");
//                    nueva_entrada = new SimpleEntry<>(clave, valor);
//                    formulario_simple_claves_valor_lista.add(nueva_entrada);
//                }
//                formulario_simple.importar_valores(formulario_simple_claves_valor_lista, ok);
//                if (ok.es == false) { return ok.es; }
//                formulario_simple.procesar(ok);
//                if (ok.es == false) { return ok.es; }
//                String error_tex = formulario_simple.valores_mapa.get(k_valores_mapa_mensaje_error_tex);
//                if (error_tex.isEmpty()) {
//                    in = ResourceBundles.getBundle(k_in_ruta);
//                    error_tex = tr.in(in, "Formulario completado con éxito. ");
//                    formulario_simple.valores_mapa.put(k_valores_mapa_mensaje_error_tex, error_tex);
//                }
//                if (ok.es == false) { return ok.es; }
//                capturar_formulario_simple(formulario_simple.getValores_mapa(), ok);
//                if (ok.es == false) { return ok.es; }
//                List<Entry<String, Object>> index_claves_valor_lista;
//                index_claves_valor_lista = index.exportar_valores(k_clave_index, ok, extras_array);
//                if (ok.es == false) { return ok.es; }
//                nueva_entrada = index_claves_valor_lista.get(0);
//                @SuppressWarnings("unchecked")
//                Map<String, String> valores_mapa = (Map<String, String>) nueva_entrada.getValue();
//                valores_mapa.put(k_formulario_tex, formulario_simple.getContenido_formulario_html());
//                index.importar_valores(k_clave_index, index_claves_valor_lista, ok, extras_array);
//                capturar_formulario_index(index_valores_mapa, ok);
//                if (ok.es == false) { return ok.es; }
//            }
//        } catch (Exception e) {
//            ok.setTxt(e);
//        }
//        return ok.es;
//    }
    public boolean configurar(oks ok, Object... extra_array) throws Exception {
        // Terminar clase principal de la librería
        if (ok.es == false) { return ok.es; }
        ResourceBundle in = null;
        try {
            in = ResourceBundles.getBundle(k_in_ruta);
            clab_criptomonedas.url = inicial.properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_url);
            if (clab_criptomonedas.url == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_url);
            }
            clab_criptomonedas.driver = inicial.properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_driver);
            if (clab_criptomonedas.driver == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_driver);
            }
            clab_criptomonedas.conexion = inicial.properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_conexion);
            if (clab_criptomonedas.conexion == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_conexion);
            }
            clab_criptomonedas.usuario = inicial.properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_usuario);
            if (clab_criptomonedas.usuario == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_usuario);
            }
            clab_criptomonedas.clave = inicial.properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_clave);
            if (clab_criptomonedas.clave == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_clave);
            }
            clab_criptomonedas.select = inicial.properties.getProperty(k_clab_criptomonedas_select);
            if (clab_criptomonedas.select == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select);
            }
            clab_criptomonedas.select_columnas_tex = inicial.properties.getProperty(k_clab_criptomonedas_select_columnas_tex);
            if (clab_criptomonedas.select_columnas_tex == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select_columnas_tex);
            }
            clab_criptomonedas.select_columnas_cabecera_tex = inicial.properties.getProperty(k_clab_criptomonedas_select_columnas_cabecera_tex);
            if (clab_criptomonedas.select_columnas_cabecera_tex == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select_columnas_cabecera_tex);
            }
            clab_criptomonedas.select_pagina_tam = inicial.properties.getProperty(k_clab_criptomonedas_select_pagina_tam);
            if (clab_criptomonedas.select_pagina_tam == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select_pagina_tam);
            } else {
                clab_criptomonedas.pagina_tam = Integer.valueOf(clab_criptomonedas.select_pagina_tam);
            }
            clab_criptomonedas.select_count = inicial.properties.getProperty(k_clab_criptomonedas_select_count);
            if (clab_criptomonedas.select_count == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select_count);
            }
            clab_criptomonedas.insert = inicial.properties.getProperty(k_clab_criptomonedas_insert);
            if (clab_criptomonedas.insert == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_insert);
            }
            clab_criptomonedas.update = inicial.properties.getProperty(k_clab_criptomonedas_update);
            if (clab_criptomonedas.update == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_update);
            }
            clab_criptomonedas.delete = inicial.properties.getProperty(k_clab_criptomonedas_delete);
            if (clab_criptomonedas.delete == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_delete);
            }
            clab_criptomonedas.letras_por_linea = inicial.properties.getProperty(k_clab_criptomonedas_letras_por_linea);
            if (clab_criptomonedas.letras_por_linea == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_letras_por_linea);
            }
            if (ok.es == false) {
                inicial.escribir_linea_error(ok.getTxt(), ok, extra_array);
            }
        } catch (Exception e) {
            throw e;
        }
        return ok.es;
    }

}
