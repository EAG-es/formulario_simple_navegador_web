package ingui.javafx.formulario_simple_navegador_web;

import inclui.formularios.control_entradas;
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
import static innui.formularios.formularios.k_fase_procesamiento;
import innui.modelos.comunicaciones.url.urls;
import innui.modelos.configuraciones.ResourceBundles;
import innui.modelos.configuraciones.Resources;
import innui.modelos.configuraciones.iniciales;
import innui.modelos.errores.oks;
import innui.modelos.internacionalizacion.tr;
import innui.modelos.modelos;
import innui.modelos.modelos_comunicaciones.modelos_comunicaciones;
import inweb.modelos_html.formularios.control_selecciones;
import inweb.modelos_html.formularios.control_textareas;
import inweb.modelos_html.formularios.web_formularios;
import static inweb.modelos_html.formularios.web_formularios.k_nombre_fragmento;
import static inweb.modelos_html.formularios.web_formularios.k_valores_mapa_mensaje_error_tex;
import static inweb.modelos_html.formularios.web_formularios.k_valores_mapa_url_destino_tex;
import static inweb.modelos_html.formularios.web_formularios.k_valores_mapa_valor_tex;
import java.io.InputStream;
import static java.lang.System.exit;
import java.net.URL;
import java.util.AbstractMap.SimpleEntry;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
    public static String k_clave_index = "index";
    public static String k_clave_submit = "submit";
    public static String k_titulo_tex = "titulo_tex";
    public static String k_mensaje_imagen_tex = "mensaje_imagen_tex";
    public static String k_imagen_ruta_tex = "imagen_ruta_tex";
    public static String k_mensaje_cabecera_tex = "mensaje_cabecera_tex";
    public static String k_formulario_tex = "formulario_tex";
    public static String k_paises_seleccion_ruta = "/re/paises.properties";
    web_formularios index = new web_formularios();
    public Map <String, String> index_valores_mapa = new HashMap<>();
    public Map <String, Object> formulario_simple_opciones_mapa = new HashMap<>();
    web_formularios formulario_simple = new web_formularios() {
        @Override
        public boolean _terminar_formulario(String modo_operacion, oks ok, Object ... extras_array) throws Exception {
            try {
                if (ok.es == false) { return false; }
                super._terminar_formulario(modo_operacion, ok, extras_array);
                if (ok.es == false) { return false; }
                if (modo_operacion.equals(k_fase_procesamiento)) {
                    ser_formulario_valido(ok);
                }
            } catch (Exception e) {
                throw e;
            }
            return ok.es;
        }
    };
    public Map <String, String> formulario_simple_valores_mapa = new HashMap<>();
    public Map <String, Object> index_opciones_mapa = new HashMap<>();
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
        capturar_formulario_simple(formulario_simple_valores_mapa, ok);
        if (ok.es == false) { return ok.es; }
        construir_formulario_index(ok);
        if (ok.es == false) { return ok.es; }
        capturar_formulario_index(index_valores_mapa, ok);
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
            entrada_texto.poner_en_formulario(formulario_simple, k_clave_nombre_apellidos, null, tr.in(in, "Introduzca su nombre y sus apellidos. "), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_radio = new inweb.modelos_html.formularios.control_entradas();
            entrada_radio.iniciar(k_entradas_tipo_radio, ok);
            if (ok.es == false) { return ok.es; }
            Map <String, String> valores_mapa = new HashMap<>();
            valores_mapa.put(k_valores_mapa_valor_tex, "XY");
            entrada_radio.poner_en_formulario(formulario_simple, k_clave_sexo, valores_mapa, tr.in(in, "Opción 1/3: ¿Sexo XY (macho)? "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_radio = new inweb.modelos_html.formularios.control_entradas();
            entrada_radio.iniciar(k_entradas_tipo_radio, ok);
            if (ok.es == false) { return ok.es; }
            valores_mapa = new HashMap<>();
            valores_mapa.put(k_valores_mapa_valor_tex, "XX");
            entrada_radio.poner_en_formulario(formulario_simple, k_clave_sexo, valores_mapa, tr.in(in, "Opción 2/3: ¿Sexo XX (hembra)? "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_radio = new inweb.modelos_html.formularios.control_entradas();
            entrada_radio.iniciar(k_entradas_tipo_radio, ok);
            if (ok.es == false) { return ok.es; }
            valores_mapa = new HashMap<>();
            valores_mapa.put(k_valores_mapa_valor_tex, "..");
            entrada_radio.poner_en_formulario(formulario_simple, k_clave_sexo, valores_mapa, tr.in(in, "Opción 3/3: ¿Otro (No XY y no XX)? "), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_fecha = new inweb.modelos_html.formularios.control_entradas();
            entrada_fecha.iniciar(k_entradas_tipo_fecha, ok);
            if (ok.es == false) { return ok.es; }
            entrada_fecha.poner_en_formulario(formulario_simple, k_clave_fecha, null, tr.in(in, "Introduzca su fecha de nacimiento. "), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_email = new inweb.modelos_html.formularios.control_entradas();
            entrada_email.iniciar(k_entradas_tipo_email, ok);
            if (ok.es == false) { return ok.es; }
            entrada_email.poner_en_formulario(formulario_simple, k_clave_email, null, tr.in(in, "Introduzca su email. "), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_telefono = new inweb.modelos_html.formularios.control_entradas();
            entrada_telefono.iniciar(k_entradas_tipo_telefono, ok);
            if (ok.es == false) { return ok.es; }
            entrada_telefono.poner_en_formulario(formulario_simple, k_clave_telefono, null, tr.in(in, "Introduzca su teléfono. "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto.poner_en_formulario(formulario_simple, k_clave_calle, null, tr.in(in, "Introduzca primera parte de su dirección (solo nombre de la calle). "), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_numero = new inweb.modelos_html.formularios.control_entradas();
            entrada_numero.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            entrada_numero.poner_en_formulario(formulario_simple, k_clave_portal_num, null, tr.in(in, "Introduzca el número del portal de su dirección. "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            Map <String, Object> opciones_mapa = new HashMap<>();
            opciones_mapa.put(k_opciones_mapa_no_requerido, true);
            entrada_texto.poner_en_formulario(formulario_simple, k_clave_calle_extra, null, tr.in(in, "Introduzca parte extra de su dirección (después se pedirá piso y puerta). "), opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            entrada_numero = new inweb.modelos_html.formularios.control_entradas();
            entrada_numero.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            entrada_numero.poner_en_formulario(formulario_simple, k_clave_piso_num, null, tr.in(in, "Introduzca el piso de su dirección (0 si no hay). "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto.poner_en_formulario(formulario_simple, k_clave_puerta_num, null, tr.in(in, "Introduzca la puerta de su dirección. "), opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto.poner_en_formulario(formulario_simple, k_clave_vivienda_extra, null, tr.in(in, "Introduzca parte extra de identificacion de su vivienda (después se pedirá la ciudad). "), opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto.poner_en_formulario(formulario_simple, k_clave_ciudad, null, tr.in(in, "Introduzca la ciudad. "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_numero = new inweb.modelos_html.formularios.control_entradas();
            entrada_numero.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            entrada_numero.poner_en_formulario(formulario_simple, k_clave_codigo_postal, null, tr.in(in, "Introduzca el código postal. "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto.poner_en_formulario(formulario_simple, k_clave_provincia_estado, null, tr.in(in, "Introduzca la provincia/estado. "), null, ok);
            if (ok.es == false) { return ok.es; }
            control_selecciones paises_seleccion = new control_selecciones();
            paises_seleccion.iniciar(null, ok);
            if (ok.es == false) { return ok.es; }
            paises_seleccion.cargar_control_con_propiedades(k_paises_seleccion_ruta, ok);
            if (ok.es == false) { return ok.es; }
            paises_seleccion.poner_en_formulario(formulario_simple, k_clave_pais, null, tr.in(in, "Introduzca el país. "), opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_contraseña = new inweb.modelos_html.formularios.control_entradas();
            entrada_contraseña.iniciar(k_entradas_tipo_password, ok);
            if (ok.es == false) { return ok.es; }
            entrada_contraseña.poner_en_formulario(formulario_simple, k_clave_password, null, tr.in(in, "Introduzca la contraseña que desea establecer. "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_contraseña = new inweb.modelos_html.formularios.control_entradas();
            entrada_contraseña.iniciar(k_entradas_tipo_password, ok);
            if (ok.es == false) { return ok.es; }
            entrada_contraseña.poner_en_formulario(formulario_simple, k_clave_password_repetida, null, tr.in(in, "Repita la contraseña que desea establecer. "), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_fecha_y_hora = new inweb.modelos_html.formularios.control_entradas() {
                @Override
                public boolean _validar_fecha_y_hora(Object objeto_a_validar, oks ok, Object ... extras_array) throws Exception {
                    try {
                        if (ok.es == false) { return false; }
                        super._validar_fecha_y_hora(objeto_a_validar, ok, extras_array);
                        if (ok.es == false) { return false; }
                        Date date;
                        date = (Date) super._convertir(k_fase_procesamiento, objeto_a_validar, ok, extras_array);
                        if (ok.es == false) { return false; }
                        Date actual_date = new Date();
                        if (actual_date.getTime() > date.getTime()) {
                            ok.setTxt(tr.in(in, "La fecha introducida no puede ser anterior a la fecha actual. "));
                            return ok.es;
                        }
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(date);
                        Calendar actual_calendar = Calendar.getInstance();
                        actual_calendar.setTime(actual_date);
                        int año = calendar.get(Calendar.YEAR);
                        int actual_año = actual_calendar.get(Calendar.YEAR);
                        int dia_del_año = calendar.get(Calendar.DAY_OF_YEAR);
                        int actual_dia_del_año = actual_calendar.get(Calendar.DAY_OF_YEAR);
                        int dias_del_año = actual_calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
                        if (año == actual_año) {
                            if ((actual_dia_del_año + 30) < dia_del_año) {
                                ok.setTxt(tr.in(in, "La fecha introducida no puede ser más de 30 días posterior a la actual. "));
                                return ok.es;
                            }
                        } else if (año == (actual_año + 1)) {
                            if (((actual_dia_del_año + 30) % dias_del_año) >= 31) {
                                ok.setTxt(tr.in(in, "La fecha introducida no puede ser más de 30 días posterior a la actual. "));
                                return ok.es;
                            } else if (dia_del_año >= ((actual_dia_del_año + 30) % dias_del_año)) {
                                ok.setTxt(tr.in(in, "La fecha introducida no puede ser más de 30 días posterior a la actual. "));
                                return ok.es;                                
                            }
                        } else {
                            ok.setTxt(tr.in(in, "La fecha introducida no puede ser más de 30 días posterior a la actual. "));
                            return ok.es;
                        }
                    } catch (Exception e) {
                        ok.setTxt(e);
                    }
                    return ok.es;
                }
            };
            entrada_fecha_y_hora.iniciar(k_entradas_tipo_fecha_y_hora, ok);
            if (ok.es == false) { return ok.es; }
            entrada_fecha_y_hora.poner_en_formulario(formulario_simple, k_clave_fecha_y_hora_disponibilidad, null, tr.in(in, "Introduzca la fecha y la hora a partir de la que desea que la información proporcionada quede disponible . "), null, ok);
            if (ok.es == false) { return ok.es; }
            control_textareas textarea = new control_textareas();
            textarea.iniciar(null, ok);
            if (ok.es == false) { return ok.es; }
            textarea.poner_en_formulario(formulario_simple, k_clave_comentarios, null, tr.in(in, "Comentarios adicionales: "), opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_reset = new inweb.modelos_html.formularios.control_entradas();
            entrada_reset.iniciar(k_entradas_tipo_reset, ok);
            if (ok.es == false) { return ok.es; }
            entrada_reset.poner_en_formulario(formulario_simple, k_clave_reset, null, tr.in(in, "Reiniciar"), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_submit = new inweb.modelos_html.formularios.control_entradas();
            entrada_submit.iniciar(k_entradas_tipo_submit, ok);
            if (ok.es == false) { return ok.es; }
            entrada_submit.poner_en_formulario(formulario_simple, k_clave_submit, null, tr.in(in, "Enviar"), null, ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }    

    public boolean capturar_formulario_simple(Map <String, String> valores_mapa, oks ok, Object... extra_array) throws Exception {
        ResourceBundle in;
        try {
            if (ok.es == false) { return ok.es; }
            valores_mapa.put(k_valores_mapa_url_destino_tex, k_formulario_simple_inicio_url + k_formulario_simple_index_html);
            formulario_simple.iniciar(k_fragmentos_principales_ruta, valores_mapa, null, ok);
            if (ok.es == false) { return ok.es; }
            formulario_simple.capturar(ok);
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
            formulario_simple_opciones_mapa.put(k_nombre_fragmento, k_opcion_nombre_fragmento_html);
            index_valores_mapa.clear();
            index_valores_mapa.put(k_titulo_tex, tr.in(in, "Formulario simple navegador web"));
            index_valores_mapa.put(k_mensaje_imagen_tex, k_imagen_cabecera_ruta);
            URL imagen_url;
            imagen_url = Resources.getResource(k_imagen_cabecera_ruta);
            index_valores_mapa.put(k_imagen_ruta_tex, "file://" + imagen_url.getPath());
            index_valores_mapa.put(k_mensaje_cabecera_tex, tr.in(in, "Formulario simple navegador web"));
            index_valores_mapa.put(k_formulario_tex, formulario_simple.getContenido_formulario_html());
            inweb.modelos_html.formularios.control_textos control_texto = new inweb.modelos_html.formularios.control_textos();
            if (ok.es == false) { return ok.es; }
            control_texto.poner_en_formulario(index, k_clave_index, index_valores_mapa, null, formulario_simple_opciones_mapa, ok);
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
     * /formulario_simple/index_html?nombre_apellidos=e&sexo=&fecha=1969-02-10&email=eag2001%40gmail.com&telefono=639833958&calle=Rambla+de+Santa+Cruz&portal_num=139&calle_extra=Edificio+Taomar&piso_num=1&puerta_num=12&vivienda_extra=&ciudad=Santa+Cruz+de+Tenerife&codigo_postal=38001&provincia_estado=Tenerife&password=contrase%C3%B1a&password_repetida=contrase%C3%B1a&fecha_y_hora_disponibilidad=2023-02-04T12%3A45&submit=Enviar
     * @param url
     * @param ok
     * @param extras_array
     * @return true si todo es correcto, false/null si hay error.
     * @throws Exception 
     */
    @Override
    public Boolean procesar_evento_llamada_a_url(URL url, oks ok, Object ... extras_array) throws Exception {
        return procesar_formulario(url, ok, extras_array);
    }
    
    public boolean procesar_formulario(URL url, oks ok, Object ... extras_array) throws Exception {
        ResourceBundle in;
        try {
            if (ok.es == false) { return ok.es; }
            Map<String, String> datos_mapa = new LinkedHashMap<>();
            if (url.getPath().endsWith(k_formulario_simple_index_html)) {
                urls.extraer_parametros_query(url, datos_mapa, ok);
                if (ok.es == false) { return ok.es; }
                String clave, valor;
                List<Entry<String, Object>> formulario_simple_claves_valor_lista = new LinkedList<>();
                Entry<String, Object> nueva_entrada;
                for(Entry<String, String> entry: datos_mapa.entrySet()) {
                    clave = entry.getKey();
                    valor = entry.getValue();
                    clave = clave.replaceAll("^\\.+\\[\\s*\\d+\\s*\\]$", "");
                    nueva_entrada = new SimpleEntry<>(clave, valor);
                    formulario_simple_claves_valor_lista.add(nueva_entrada);
                }
                formulario_simple.importar_valores(formulario_simple_claves_valor_lista, ok);
                if (ok.es == false) { return ok.es; }
                formulario_simple.procesar(ok);
                if (ok.es == false) { return ok.es; }
                String error_tex = formulario_simple.valores_mapa.get(k_valores_mapa_mensaje_error_tex);
                if (error_tex.isEmpty()) {
                    in = ResourceBundles.getBundle(k_in_ruta);
                    error_tex = tr.in(in, "Formulario completado con éxito. ");
                    formulario_simple.valores_mapa.put(k_valores_mapa_mensaje_error_tex, error_tex);
                }
                if (ok.es == false) { return ok.es; }
                capturar_formulario_simple(formulario_simple.getValores_mapa(), ok);
                if (ok.es == false) { return ok.es; }
                List<Entry<String, Object>> index_claves_valor_lista;
                index_claves_valor_lista = index.exportar_valores(k_clave_index, ok, extras_array);
                if (ok.es == false) { return ok.es; }
                nueva_entrada = index_claves_valor_lista.get(0);
                @SuppressWarnings("unchecked")
                Map<String, String> valores_mapa = (Map<String, String>) nueva_entrada.getValue();
                valores_mapa.put(k_formulario_tex, formulario_simple.getContenido_formulario_html());
                index.importar_valores(k_clave_index, index_claves_valor_lista, ok, extras_array);
                capturar_formulario_index(index_valores_mapa, ok);
                if (ok.es == false) { return ok.es; }
            }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }
    
    @SuppressWarnings("unchecked")
    public boolean ser_formulario_valido(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in;
        try {
            String error_tex;
            String password = "";
            String password_repetida = "";
            Map<String, String> valores_mapa;
            for (controles control : formulario_simple._controles_lista) {
                if (control.clave.equals(k_clave_password)) {
                    valores_mapa = (Map<String, String>) control.valor;
                    password = valores_mapa.get(k_valores_mapa_valor_tex);
                } else if (control.clave.equals(k_clave_password_repetida)) {
                    valores_mapa = (Map<String, String>) control.valor;
                    password_repetida = valores_mapa.get(k_valores_mapa_valor_tex);
                }
            }
            if (password.equals(password_repetida) == false) {
                in = ResourceBundle.getBundle(k_in_ruta);
                error_tex = tr.in(in, "La clave y la clave repetida no coinciden. ");
                oks ok_1 = new oks();
                formulario_simple.escribir_linea_error(error_tex, ok_1);
                if (ok_1.es == false) {
                    ok.setTxt(ok.getTxt(), ok_1.getTxt());                    
                }
            }
            return ok.es;
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }    
}
