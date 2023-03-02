package ingui.javafx.formulario_simple_navegador_web;

import static inclui.formularios.control_entradas.k_entradas_tipo_email;
import static inclui.formularios.control_entradas.k_entradas_tipo_fecha;
import static inclui.formularios.control_entradas.k_entradas_tipo_fecha_y_hora;
import static inclui.formularios.control_entradas.k_entradas_tipo_numero;
import static inclui.formularios.control_entradas.k_entradas_tipo_password;
import static inclui.formularios.control_entradas.k_entradas_tipo_radio;
import static inclui.formularios.control_entradas.k_entradas_tipo_reset;
import static inclui.formularios.control_entradas.k_entradas_tipo_submit;
import static inclui.formularios.control_entradas.k_entradas_tipo_telefono;
import static inclui.formularios.control_entradas.k_entradas_tipo_texto;
import ingui.javafx.navegador_web.Navegador_web;
import innui.formularios.controles;
import static innui.formularios.controles.k_opciones_mapa_no_requerido;
import innui.modelos.comunicaciones.url.urls;
import innui.modelos.configuraciones.ResourceBundles;
import innui.modelos.configuraciones.Resources;
import innui.modelos.configuraciones.iniciales;
import innui.modelos.errores.oks;
import innui.modelos.internacionalizacion.tr;
import innui.modelos.modelos;
import innui.modelos.modelos_comunicaciones.modelos_comunicaciones;
import static inweb.modelos_html.formularios.control_textos.k_nombre_fragmento;
import inweb.modelos_html.formularios.web_formularios;
import static inweb.modelos_html.formularios.web_formularios.k_valores_mapa_mensaje_error_tex;
import static inweb.modelos_html.formularios.web_formularios.k_valores_mapa_url_destino_tex;
import java.io.InputStream;
import static java.lang.System.exit;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
public class Formulario_simple_navegador_web extends Navegador_web {
    public static String k_in_ruta = "in/ingui/javafx/formulario_simple_navegador_web/in";
    public static String k_icono_ruta = "/re/static/ingui.javafx.formulario_simple_navegador_web.png";
    public static String k_imagen_cabecera_ruta = "/re/static/ingui.javafx.formulario_simple_navegador_web.cripto_y_mas.png";
    public static String k_fragmentos_principales_ruta = "/re/templates/formularios/fragmentos/fragmentos_principales.html";
    public static String k_index_ruta = "/re/templates/formulario_simple/index.html";
    public static String k_formulario_simple_inicio_url = "https://localhost";
    public static String k_formulario_simple_index_html = "/formulario_simple/index_html";
    public static String k_opcion_nombre_fragmento_html = "html";
    public static String k_clave_nombre_apellidos = "nombre_apellidos";
    public static String k_clave_sexo = "sexo";
    public static String k_clave_fecha = "fecha";
    public static String k_clave_hora = "hora";
    public static String k_clave_color = "color";
    public static String k_clave_email = "email";
    public static String k_clave_password = "password";
    public static String k_clave_password_repetida = "password_repetida";
    public static String k_clave_telefono = "telefono";
    public static String k_clave_calle = "calle";
    public static String k_clave_portal_num = "portal_num";
    public static String k_clave_calle_extra = "calle_extra";
    public static String k_clave_piso_num = "piso_num";
    public static String k_clave_puerta_num = "puerta_num";
    public static String k_clave_vivienda_extra = "vivienda_extra";
    public static String k_clave_ciudad = "ciudad";
    public static String k_clave_codigo_postal = "codigo_postal";
    public static String k_clave_provincia_estado = "provincia_estado";
    public static String k_clave_pais = "pais";
    public static String k_clave_fecha_y_hora_disponibilidad = "fecha_y_hora_disponibilidad";
    public static String k_clave_comentarios = "clave_comentarios";
    public static String k_clave_reset = "reset";
    public static String k_clave_submit = "submit";
    public static String k_titulo_tex = "titulo_tex";
    public static String k_mensaje_imagen_tex = "mensaje_imagen_tex";
    public static String k_imagen_ruta_tex = "imagen_ruta_tex";
    public static String k_mensaje_cabecera_tex = "mensaje_cabecera_tex";
    public static String k_formulario_tex = "formulario_tex";
    web_formularios web_formulario = new web_formularios() {
        @Override
        public boolean _terminar_formulario(String modo_operacion, oks ok, Object ... extras_array) throws Exception {
            try {
                if (ok.es == false) { return false; }
                if (modo_operacion.equals(k_fase_procesamiento)) {
                    ser_formulario_valido(ok);
                    if (ok.es == false) {
                        Formulario_simple_navegador_web.this.poner_error(ok.getTxt(), ok);
                    }
                }
            } catch (Exception e) {
                throw e;
            }
            return ok.es;
        }
    };
    web_formularios index = new web_formularios();
    public iniciales inicial = new iniciales () {
        @Override
        public boolean run(oks ok, Object... extra_array) throws Exception {
            try {
                iniciar(ok);
                if (ok.es) {
                    Formulario_simple_navegador_web.super.inicial.run(ok, Formulario_simple_navegador_web.class, extra_array[0]);
                    oks ok_fin = new oks();
                    terminar(ok_fin);
                    ok.setTxt(ok.getTxt(), ok_fin.getTxt());
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
            _terminar_desde_clase(modelos_comunicaciones.class, ok);
            if (ok.es == false) { return ok.es; }
            _terminar_desde_clase(Navegador_web.class, ok);
            if (ok.es == false) { return ok.es; }
            _terminar_desde_clase(this.getClass(), ok);
            if (ok.es == false) { return ok.es; }
            return ok.es;
        }       
    };

    public Formulario_simple_navegador_web() throws Exception {        
    }
    
    public static void main(String[] args) {
        oks ok = new oks();
        Formulario_simple_navegador_web hola_mundo_navegador_web = null;
        try {
            hola_mundo_navegador_web = new Formulario_simple_navegador_web();
            Object [] extra_array = { args };
            hola_mundo_navegador_web.inicial.run(ok, extra_array);
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
        if (ok.es == false) { return ok.es; }
        construir_formulario_simple(ok);
        if (ok.es == false) { return ok.es; }
        procesar_formulario_simple(ok);
        if (ok.es == false) { return ok.es; }
        procesar_index(ok);
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
    
    public boolean construir_formulario_simple(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in;
        in = ResourceBundles.getBundle(k_in_ruta);
        try {
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto.poner_en_formulario(web_formulario, k_clave_nombre_apellidos, null, tr.in(in, "Introduzca su nombre y sus apellidos. "), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_radio = new inweb.modelos_html.formularios.control_entradas();
            entrada_radio.iniciar(k_entradas_tipo_radio, ok);
            if (ok.es == false) { return ok.es; }
            entrada_radio.poner_en_formulario(web_formulario, k_clave_sexo, null, tr.in(in, "Opción 1/3: ¿Sexo XY (macho)? "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_radio = new inweb.modelos_html.formularios.control_entradas();
            entrada_radio.iniciar(k_entradas_tipo_radio, ok);
            if (ok.es == false) { return ok.es; }
            entrada_radio.poner_en_formulario(web_formulario, k_clave_sexo, null, tr.in(in, "Opción 2/3: ¿Sexo XX (hembra)? "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_radio = new inweb.modelos_html.formularios.control_entradas();
            entrada_radio.iniciar(k_entradas_tipo_radio, ok);
            if (ok.es == false) { return ok.es; }
            entrada_radio.poner_en_formulario(web_formulario, k_clave_sexo, null, tr.in(in, "Opción 3/3: ¿Otro (No XY y no XX)? "), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_fecha = new inweb.modelos_html.formularios.control_entradas();
            entrada_fecha.iniciar(k_entradas_tipo_fecha, ok);
            if (ok.es == false) { return ok.es; }
            entrada_fecha.poner_en_formulario(web_formulario, k_clave_fecha, null, tr.in(in, "Introduzca su fecha de nacimiento. "), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_email = new inweb.modelos_html.formularios.control_entradas();
            entrada_email.iniciar(k_entradas_tipo_email, ok);
            if (ok.es == false) { return ok.es; }
            entrada_email.poner_en_formulario(web_formulario, k_clave_email, null, tr.in(in, "Introduzca su email. "), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_telefono = new inweb.modelos_html.formularios.control_entradas();
            entrada_telefono.iniciar(k_entradas_tipo_telefono, ok);
            if (ok.es == false) { return ok.es; }
            entrada_telefono.poner_en_formulario(web_formulario, k_clave_telefono, null, tr.in(in, "Introduzca su teléfono. "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto.poner_en_formulario(web_formulario, k_clave_calle, null, tr.in(in, "Introduzca primera parte de su dirección (solo nombre de la calle). "), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_numero = new inweb.modelos_html.formularios.control_entradas();
            entrada_numero.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            entrada_numero.poner_en_formulario(web_formulario, k_clave_portal_num, null, tr.in(in, "Introduzca el número del portal de su dirección. "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            Map <String, Object> opciones_mapa = new HashMap<>();
            opciones_mapa.put(k_opciones_mapa_no_requerido, true);
            entrada_texto.poner_en_formulario(web_formulario, k_clave_calle_extra, null, tr.in(in, "Introduzca parte extra de su dirección (después se pedirá piso y puerta). "), opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            entrada_numero = new inweb.modelos_html.formularios.control_entradas();
            entrada_numero.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            entrada_numero.poner_en_formulario(web_formulario, k_clave_piso_num, null, tr.in(in, "Introduzca el piso de su dirección (0 si no hay). "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto.poner_en_formulario(web_formulario, k_clave_puerta_num, null, tr.in(in, "Introduzca la puerta de su dirección. "), opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto.poner_en_formulario(web_formulario, k_clave_vivienda_extra, null, tr.in(in, "Introduzca parte extra de identificacion de su vivienda (después se pedirá la ciudad). "), opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto.poner_en_formulario(web_formulario, k_clave_ciudad, null, tr.in(in, "Introduzca la ciudad. "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_numero = new inweb.modelos_html.formularios.control_entradas();
            entrada_numero.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            entrada_numero.poner_en_formulario(web_formulario, k_clave_codigo_postal, null, tr.in(in, "Introduzca el código postal. "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto.poner_en_formulario(web_formulario, k_clave_provincia_estado, null, tr.in(in, "Introduzca la provincia/estado. "), null, ok);
            if (ok.es == false) { return ok.es; }
//            control_selecciones paises_seleccion = new control_selecciones();
//            paises_seleccion.iniciar(null, ok);
//            if (ok.es == false) { return ok.es; }
//            paises_seleccion.cargar_propiedades(k_paises_seleccion_ruta,  ok);
//            if (ok.es == false) { return ok.es; }
//            opciones_mapa.put(k_control_selecciones_opciones_mapa, paises_seleccion.control_selecciones_mapa);
//            String letras_por_linea = properties.getProperty(k_formulario_simple_letras_por_linea_num);
//            Integer letras_por_linea_num = null;
//            try {
//                letras_por_linea_num = Integer.valueOf(letras_por_linea);
//            } catch (Exception e) {
//                ok.setTxt("Valor con formato incorrecto: " + k_formulario_simple_letras_por_linea_num);
//            }
//            if (ok.es == false) { return ok.es; }
//            opciones_mapa.put(k_control_selecciones_letras_por_linea_num, letras_por_linea_num);
//            paises_seleccion.poner_en_formulario(web_formulario, k_clave_pais, null, tr.in(in, "Introduzca el país. "), opciones_mapa, ok);
//            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_contraseña = new inweb.modelos_html.formularios.control_entradas();
            entrada_contraseña.iniciar(k_entradas_tipo_password, ok);
            if (ok.es == false) { return ok.es; }
            entrada_contraseña.poner_en_formulario(web_formulario, k_clave_password, null, tr.in(in, "Introduzca la contraseña que desea establecer. "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_contraseña = new inweb.modelos_html.formularios.control_entradas();
            entrada_contraseña.iniciar(k_entradas_tipo_password, ok);
            if (ok.es == false) { return ok.es; }
            entrada_contraseña.poner_en_formulario(web_formulario, k_clave_password_repetida, null, tr.in(in, "Repita la contraseña que desea establecer. "), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_fecha_y_hora = new inweb.modelos_html.formularios.control_entradas();
            entrada_fecha_y_hora.iniciar(k_entradas_tipo_fecha_y_hora, ok);
            if (ok.es == false) { return ok.es; }
            entrada_fecha_y_hora.poner_en_formulario(web_formulario, k_clave_fecha_y_hora_disponibilidad, null, tr.in(in, "Introduzca la fecha y la hora a partir de la que desea que la información proporcionada quede disponible . "), null, ok);
            if (ok.es == false) { return ok.es; }
//            control_textareas textarea = new control_textareas();
//            textarea.iniciar(null, ok);
//            textarea.iniciar(k_entradas_tipo_reset, ok);
//            textarea.poner_en_formulario(web_formulario, k_clave_comentarios, null, tr.in(in, "Comentarios adicionales: "), opciones_mapa, ok);
//            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_reset = new inweb.modelos_html.formularios.control_entradas();
            entrada_reset.iniciar(k_entradas_tipo_reset, ok);
            if (ok.es == false) { return ok.es; }
            entrada_reset.poner_en_formulario(web_formulario, k_clave_reset, null, tr.in(in, "Reiniciar"), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_submit = new inweb.modelos_html.formularios.control_entradas();
            entrada_submit.iniciar(k_entradas_tipo_submit, ok);
            if (ok.es == false) { return ok.es; }
            entrada_submit.poner_en_formulario(web_formulario, k_clave_submit, null, tr.in(in, "Enviar"), null, ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }    

    public boolean procesar_formulario_simple(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in;
        try {
            if (ok.es == false) { return ok.es; }
            Map <String, String> valores_mapa = new HashMap<>();
            if (ok.es == false) { return ok.es; }
            valores_mapa.put(k_valores_mapa_url_destino_tex, k_formulario_simple_inicio_url + k_formulario_simple_index_html);
            web_formulario.iniciar(k_fragmentos_principales_ruta, valores_mapa, null, ok);
            if (ok.es == false) { return ok.es; }
            web_formulario.capturar(ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }    
    public boolean procesar_index(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in;
        in = ResourceBundles.getBundle(k_in_ruta);
        try {
            if (ok.es == false) { return ok.es; }
            Map <String, String> valores_mapa = new HashMap<>();
            Map <String, Object> opciones_mapa = new HashMap<>();
            index.iniciar(k_index_ruta, valores_mapa, null, ok);
            if (ok.es == false) { return ok.es; }
            opciones_mapa.put(k_nombre_fragmento, k_opcion_nombre_fragmento_html);
            valores_mapa.clear();
            valores_mapa.put(k_titulo_tex, tr.in(in, "Formulario simple navegador web"));
            valores_mapa.put(k_mensaje_imagen_tex, k_imagen_cabecera_ruta);
            URL imagen_url;
            imagen_url = Resources.getResource(k_imagen_cabecera_ruta);
            valores_mapa.put(k_imagen_ruta_tex, "file://" + imagen_url.getPath());
            valores_mapa.put(k_mensaje_cabecera_tex, tr.in(in, "Formulario simple navegador web"));
            valores_mapa.put(k_formulario_tex, web_formulario.getFormulario_html());
            inweb.modelos_html.formularios.control_textos control_texto = new inweb.modelos_html.formularios.control_textos();
            if (ok.es == false) { return ok.es; }
            control_texto.poner_en_formulario(index, null, valores_mapa, null, opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            index.capturar(ok);
            if (ok.es == false) { return ok.es; }
            webview_simpleController_implementacion.presentar_contenido(index.getFormulario_html(), ok);
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }    
    /**
     * Captura las URLs que son llamadas (clic) en el navegador 
     * /formulario_simple/index_html?nombre_apellidos=e&sexo=&fecha=1969-02-10&email=eag2001%40gmail.com&telefono=639833958&calle=Rambla+de+Santa+Cruz&portal_num=139&calle_extra=Edificio+Taomar&piso_num=1&puerta_num=12&vivienda_extra=&ciudad=Santa+Cruz+de+Tenerife&codigo_postal=38001&provincia_estado=Tenerife&password=contrase%C3%B1a&password_repetida=contrase%C3%B1a&fecha_y_hora_disponibilidad=2023-02-04T12%3A45&submit=Enviar
     * @param url
     * @param ok
     * @param extras_array
     * @return true si todo es correcto, false/null si hay error.
     * @throws Exception 
     */
    @Override
    public Boolean procesar_evento_llamada_a_url(URL url, oks ok, Object ... extras_array) throws Exception {
        ResourceBundle in;
        try {
            if (ok.es == false) { return ok.es; }
            Map<String, String> datos_mapa = new LinkedHashMap<>();
            if (url.getPath().endsWith(k_formulario_simple_index_html)) {
                urls.extraer_parametros_query(url, datos_mapa, ok);
                if (ok.es == false) { return ok.es; }
                web_formulario.importar_valores(datos_mapa, ok);
                if (ok.es == false) { return ok.es; }
                web_formulario.procesar(ok);
                if (ok.es == false) { return ok.es; }
                String error_tex = web_formulario.valores_mapa.get(k_valores_mapa_mensaje_error_tex);
                if (error_tex.isEmpty()) {
                    in = ResourceBundles.getBundle(k_in_ruta);
                    error_tex = tr.in(in, "Formulario completado con éxito. ");
                    web_formulario.valores_mapa.put(k_valores_mapa_mensaje_error_tex, error_tex);
                }
                web_formulario.capturar(ok);
                if (ok.es == false) { return ok.es; }
                index.capturar(ok);
                if (ok.es == false) { return ok.es; }
                webview_simpleController_implementacion.presentar_contenido(index.getFormulario_html(), ok);
                if (ok.es == false) { return ok.es; }
                // Limpiar el error
                web_formulario.valores_mapa.put(k_valores_mapa_mensaje_error_tex ,"");
            }
            return ok.es;
        } catch (Exception e) {
            throw e;
        }
    }
    public boolean ser_formulario_valido(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in;
        try {
            String error_tex;
            String password = "";
            String password_repetida = "";
            for (controles control : web_formulario._controles_lista) {
                if (control.clave.equals(k_clave_password)) {
                    password = (String) control.valor;
                } else if (control.clave.equals(k_clave_password_repetida)) {
                    password_repetida = (String) control.valor;
                }
            }
            if (password.equals(password_repetida) == false) {
                in = ResourceBundle.getBundle(k_in_ruta);
                error_tex = web_formulario.valores_mapa.get(k_valores_mapa_mensaje_error_tex);
                error_tex = error_tex + tr.in(in, "La clave y la clave repetida no coinciden. ");
                web_formulario.valores_mapa.put(k_valores_mapa_mensaje_error_tex, error_tex);
            }
            return ok.es;
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }    
}
