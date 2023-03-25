package ingui.javafx.clab_criptomonedas_navegador_web;

import incli.restful.jdbc_servidor_https_spring.cliente_jdbc_servidor_https_spring;
import static inclui.formularios.control_entradas.k_entradas_tipo_numero;
import static inclui.formularios.control_entradas.k_entradas_tipo_reset;
import static inclui.formularios.control_entradas.k_entradas_tipo_submit;
import static inclui.formularios.control_entradas.k_entradas_tipo_texto;
import inweb.modelos_html.formularios.control_tablas;
import innui.bases;
import static innui.formularios.controles.k_opciones_mapa_no_requerido;
import innui.modelos.configuraciones.ResourceBundles;
import innui.modelos.errores.oks;
import innui.modelos.internacionalizacion.tr;
import innui.modelos.jdbc.sql_comandos;
import static innui.modelos.jdbc.sql_comandos.k_sql_comandos_marcador_columnas_lista_error;
import innui.modelos.tipos_valores;
import inweb.modelos_html.formularios.control_entradas;
import inweb.modelos_html.formularios.web_formularios;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import static inclui.formularios.control_tablas.k_control_tablas_opciones_mapa_lista;
import static inweb.modelos_html.formularios.control_tablas.k_control_tablas_opciones_mapa_tabla_fila_fragmento;
import static inweb.modelos_html.formularios.control_tablas.k_control_tablas_opciones_mapa_tabla_fragmento;

/**
 *
 * @author emilio
 */
public class Clab_criptomonedas extends bases {
    public static final String k_avanzar = "avanzar";
    public static final String k_retroceder = "retroceder";
    public static final String k_ir = "ir";
    public static final String k_crear = "crear";
    public static final String k_actualizar = "actualizar";
    public static final String k_borrar = "borrar";
    /** 
     * Ruta de los recursos de traducción para este paquete
     */
    public static String k_in_ruta = "in/ingui/javafx/clab_criptomonedas_navegador_web/in";
    public static String k_clab_criptomonedas_jdbc_servidor_http_spring_url = "clab_criptomonedas.jdbc_servidor_http_spring.url";
    public static String k_clab_criptomonedas_jdbc_servidor_http_spring_driver = "clab_criptomonedas.jdbc_servidor_http_spring.driver";
    public static String k_clab_criptomonedas_jdbc_servidor_http_spring_conexion = "clab_criptomonedas.jdbc_servidor_http_spring.conexion";
    public static String k_clab_criptomonedas_jdbc_servidor_http_spring_usuario = "clab_criptomonedas.jdbc_servidor_http_spring.usuario";
    public static String k_clab_criptomonedas_jdbc_servidor_http_spring_clave = "clab_criptomonedas.jdbc_servidor_http_spring.clave";
    public static String k_clab_criptomonedas_select = "clab_criptomonedas.select";
    public static String k_clab_criptomonedas_select_count = "clab_criptomonedas.select_count";
    public static String k_clab_criptomonedas_insert = "clab_criptomonedas.insert";
    public static String k_clab_criptomonedas_update = "clab_criptomonedas.update";
    public static String k_clab_criptomonedas_delete = "clab_criptomonedas.delete";
    public static String k_clab_criptomonedas_select_pagina_tam = "clab_criptomonedas.select.pagina_tam";
    public static String k_clab_criptomonedas_select_columnas_tex="clab_criptomonedas.select_columnas_tex";
    public static String k_clab_criptomonedas_select_columnas_cabecera_tex="clab_criptomonedas.select_columnas_cabecera_tex";
    public static String k_clab_criptomonedas_letras_por_linea="clab_criptomonedas.letras_por_linea";
    public static String k_lectura_clave_tabla = "lectura_clave_tabla";
    public static String k_lectura_clave_seleccion = "lectura_clave_seleccion";
    public static String k_paginacion_clave_fila_num = "paginacion_clave_fila_num";
    public static String k_insercion_clave_revisar = "insercion_clave_revisar";
    public static String k_insercion_clave_enviar = "insercion_clave_envair";
    public static String k_borrado_clave_fila_num = "borrado_clave_fila_num";
    public static String k_borrado_clave_confirmar = "borrado_clave_confirmar";
    public static String k_columna_cuenta_tex = "cuenta";
    public static String k_valores_mapa_info_tabla_tex = "info_tabla_tex";
    public static String k_valores_mapa_tabla_cuerpo = "tabla_cuerpo";
    public static String k_valores_mapa_id_criptomoneda = "id_criptomoneda";
    public static String k_valores_mapa_simbolo = "simbolo";
    public static String k_valores_mapa_capitalizacion_de_mercado = "capitalizacion_de_mercado";
    public static String k_valores_mapa_aporte_circulante = "aporte_circulante";
    public static String k_valores_mapa_capitalizacion_total_diluida = "capitalizacion_total_diluida";
    public static String k_valores_mapa_aporte_total = "aporte_total";
    public static String k_valores_mapa_aporte_maximo = "aporte_maximo";
    public static String k_valores_mapa_dominancia = "dominancia";
    public static String k_valores_mapa_total_valor_bloqueado = "total_valor_bloqueado";
    public static String k_valores_mapa_fecha_actualizacion = "fecha_actualizacion";
    public static String k_fragmento_tabla = "control_tablas_criptomonedas";
    public static String k_fragmento_tabla_fila = "control_tablas_fila_criptomoneda"; 
    public String url;
    public String driver;
    public String conexion;
    public String usuario;
    public String clave;
    public String select;
    public String select_columnas_tex;
    public String select_columnas_cabecera_tex;
    public String select_count;
    public String select_pagina_tam;
    public Integer pagina_tam;
    public String letras_por_linea;
    public String insert;
    public String update;
    public String delete;
    public LinkedList<LinkedHashMap<String, Object>> lecturas_lista;
    public LinkedList<LinkedHashMap<String, Object>> lecturas_textos_lista;
    public web_formularios lectura_web_formulario = new web_formularios() {
        @Override
        public Map<String, String> _crear_valores_mapa(Map<String, String> nuevos_datos_mapa, oks ok, Object ... extras_array) throws Exception {
            try {
                if (ok.es == false) { return null; }
                Map<String, String> datos_mapa;
                datos_mapa = super._crear_valores_mapa(nuevos_datos_mapa, ok, extras_array);
                if (ok.es == false) { return null; }
                datos_mapa.put(k_valores_mapa_info_tabla_tex, "");
                datos_mapa.put(k_valores_mapa_tabla_cuerpo, "");
                datos_mapa.put(k_valores_mapa_id_criptomoneda, "");
                datos_mapa.put(k_valores_mapa_simbolo, "");
                datos_mapa.put(k_valores_mapa_capitalizacion_de_mercado, "");
                datos_mapa.put(k_valores_mapa_aporte_circulante, "");
                datos_mapa.put(k_valores_mapa_capitalizacion_total_diluida, "");
                datos_mapa.put(k_valores_mapa_aporte_total, "");
                datos_mapa.put(k_valores_mapa_aporte_maximo, "");
                datos_mapa.put(k_valores_mapa_dominancia, "");
                datos_mapa.put(k_valores_mapa_total_valor_bloqueado, "");
                datos_mapa.put(k_valores_mapa_fecha_actualizacion, "");
                if (nuevos_datos_mapa != null) {
                    datos_mapa.putAll(nuevos_datos_mapa);
                }
                return datos_mapa;
            } catch (Exception e) {
                throw e;
            }
        }
    };
    public cliente_jdbc_servidor_https_spring cliente_jdbc_servidor_https_spring = new cliente_jdbc_servidor_https_spring();
    public control_tablas lectura_control_tabla = new control_tablas();
    public control_entradas paginacion_avanzar_boton_control_entrada = new control_entradas();
    public control_entradas paginacion_retroceder_boton_control_entrada = new control_entradas();
    public control_entradas paginacion_ir_control_entrada = new control_entradas();
    public control_entradas paginacion_ir_boton_control_entrada = new control_entradas();
    public control_entradas paginacion_crear_boton_control_entrada = new control_entradas();
    public web_formularios borrado_web_formulario = new web_formularios();
    public control_entradas borrado_control_entrada_confirmar = new control_entradas();
    public control_entradas borrado_control_entrada = new control_entradas() {
        @Override
        public boolean _validar_numero(Object objeto_a_validar, oks ok, Object... extras_array) throws Exception {
            if (ok.es == false) { return false; }
            ResourceBundle in;
            Double doble;
            int min = 1;
            int max = Integer.parseInt(select_pagina_tam);
            try {
                doble = Double.valueOf(objeto_a_validar.toString());
                int num = doble.intValue();
                if (num >= min && num <= max) {
                    return true;
                } else {
                    in = ResourceBundles.getBundle(k_in_ruta);
                    ok.setTxt(tr.in(in, "El valor debe estar entre " + min + " y " + max));
                }
            } catch (Exception e) {
                in = ResourceBundles.getBundle(k_in_ruta);
                ok.setTxt(tr.in(in, "El valor debe estar entre " + min + " y " + max));
            }
            return ok.es;
        }        
    };
    public web_formularios insercion_web_formulario = new web_formularios() {        
        @Override
        public boolean importar_valores(List<Entry<String, Object>> clave_valor_lista, oks ok, Object ... extras_array) throws Exception {
            ResourceBundle in;
            try {
                if (ok.es == false) { return false; }
                _controles_lista.get(0).importar_captura(clave_valor_lista.get(0).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(1).importar_captura(clave_valor_lista.get(1).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(2).importar_captura(clave_valor_lista.get(2).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(3).importar_captura(clave_valor_lista.get(3).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(4).importar_captura(clave_valor_lista.get(4).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(5).importar_captura(clave_valor_lista.get(5).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(6).importar_captura(clave_valor_lista.get(6).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(7).importar_captura(clave_valor_lista.get(7).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(8).importar_captura(clave_valor_lista.get(8).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(9).importar_captura(clave_valor_lista.get(10).getValue(), ok);
                if (ok.es == false) { return false; }
                _controles_lista.get(10).importar_captura(clave_valor_lista.get(11).getValue(), ok);
                if (ok.es == false) { return false; }
            } catch (Exception e) {
                throw e;
            }
            return ok.es;
        }
    };
    public web_formularios actualizado_web_formulario = new web_formularios();
    public control_entradas actualizado_control_entrada = new control_entradas() {
        @Override
        public boolean _validar_numero(Object objeto_a_validar, oks ok, Object... extras_array) throws Exception {
            if (ok.es == false) { return false; }
            ResourceBundle in;
            Double doble;
            int min = 1;
            int max = Integer.parseInt(select_pagina_tam);
            try {
                doble = Double.valueOf(objeto_a_validar.toString());
                int num = doble.intValue();
                if (num >= min && num <= max) {
                    return true;
                } else {
                    in = ResourceBundles.getBundle(k_in_ruta);
                    ok.setTxt(tr.in(in, "El valor debe estar entre " + min + " y " + max));
                }
            } catch (Exception e) {
                in = ResourceBundles.getBundle(k_in_ruta);
                ok.setTxt(tr.in(in, "El valor debe estar entre " + min + " y " + max));
            }
            return ok.es;
        }        
    };
//    /**
//     * Inicio de la aplicación desde un objeto instanciado
//     * @param ok Comunicar resultados
//     * @param extras_array Opción de añadir parámetros en el futuro.
//     * @return true si todo va bien
//     * @throws Exception Opción de notificar errores de excepción
//     */
//    public boolean run(oks ok, Object ... extras_array) throws Exception {
//        try {
//            if (ok.es == false) { return ok.es; }
//            ResourceBundle in = null;
//            String valor_tex; 
//            iniciar(ok);
//            boolean es_repetir_externo = false;
//            boolean es_repetir_interno = false;
//            Long filas_cuenta;
//            int pagina_tam;
//            if (ok.es) { 
//                LinkedList<LinkedHashMap<String, Object>> filas_lista;
//                in = ResourceBundles.getBundle(k_in_ruta);
//                Long fila_inicio_pagina = 0L;
//                while (true) {
//                    es_repetir_externo = false;
//                    configurar(ok);
//                    if (ok.es == false) { break; }
//                    crear_formulario_lectura(ok);
//                    if (ok.es == false) { break; }
//                    crear_formulario_insercion(ok);
//                    if (ok.es == false) { break; }
//                    crear_formulario_borrado(ok);
//                    if (ok.es == false) { break; }
//                    crear_formulario_actualizar(ok);
//                    if (ok.es == false) { break; }
//                    pagina_tam = Integer.parseInt(select_pagina_tam);
//                    while (true) {
//                        filas_cuenta = leer_cuenta_filas_criptomonedas(fila_inicio_pagina, ok);
//                        if (ok.es == false) { break; }
//                        leer_pagina_criptomonedas(fila_inicio_pagina, ok);
//                        if (ok.es == false) { break; }
//                        cargar_tabla(ok);
//                        if (ok.es == false) { break; }
//                        es_repetir_interno = false;
//                        escribir_linea(tr.in(in, "Presentando fila ") 
//                        + (fila_inicio_pagina + 1) + tr.in(in, " de ") + filas_cuenta, ok);
//                        lectura_web_formulario.capturar(ok);
//                        if (ok.es == false) { break; }
//                        
//                        if (lectura_web_formulario._es_cancelar) {
//                            ok.setTxt(tr.in(in, "Cancelado. "));
//                            break;
//                        }
//                        valor_tex = leer_seleccion(ok);
//                        if (ok.es == false) { break; }
//                        switch (valor_tex) {
//                        case k_retroceder -> {
//                            es_repetir_interno = true;
//                            if (fila_inicio_pagina > 0) {
//                                fila_inicio_pagina = fila_inicio_pagina - pagina_tam;
//                                if (fila_inicio_pagina < 0) {
//                                    fila_inicio_pagina = 0L;
//                                }
//                            } 
//                        }
//                        case k_avanzar -> {
//                            es_repetir_interno = true;
//                            if (fila_inicio_pagina < filas_cuenta) {
//                                if (fila_inicio_pagina + pagina_tam  < filas_cuenta) {
//                                    fila_inicio_pagina = fila_inicio_pagina + pagina_tam;
//                                }
//                            } 
//                        }
//                        case k_ir -> {
//                            es_repetir_interno = true;
//                            paginacion_clui_formulario.procesar(ok, extras_array);
//                            if (ok.es == false) { break; }
//                            if (lectura_web_formulario._es_cancelar) {
//                                ok.setTxt(tr.in(in, "Cancelado. "));
//                                break;
//                            }
//                            Double doble = (Double) paginacion_avanzar_control_entrada.valor_de_conversion;
//                            Long fila_num = doble.longValue();
//                            fila_num = fila_num - 1;
//                            if (fila_num < 0) {
//                                fila_num = 0L;
//                            } else if (fila_num > filas_cuenta) {
//                                fila_num = fila_inicio_pagina;
//                            }
//                            fila_inicio_pagina = fila_num;
//                        }
//                        case k_crear -> {
//                            es_repetir_interno = true;
//                            insercion_web_formulario.procesar(ok, extras_array);
//                            if (ok.es == false) { break; }
//                            if (lectura_web_formulario._es_cancelar) {
//                                ok.setTxt(tr.in(in, "Cancelado. "));
//                                break;
//                            }
//                            if (insercion_web_formulario._es_terminar) {
//                                List<Entry<String, Object>> entrys_lista;
//                                entrys_lista = insercion_web_formulario.exportar_valores(ok, extras_array);
//                                if (ok.es == false) { break; }
//                                LinkedList<Object> valores_lista = new LinkedList<>();
//                                for (Entry<String, Object> entry : entrys_lista) {
//                                    if (entry.getValue() == null) {
//                                        valores_lista.add(null);
//                                    } else if (entry.getValue().toString().isBlank()) {
//                                        valores_lista.add(null);
//                                    } else {
//                                        valores_lista.add(entry.getValue());
//                                    }
//                                }
//                                crear_fila(valores_lista, ok);
//                                if (ok.es == false) { break; }
//                            }
//                        }
//                        case k_actualizar -> {
//                            es_repetir_interno = true;
//                            actualizado_web_formulario.procesar(ok, extras_array);
//                            if (ok.es == false) { break; }
//                            if (lectura_web_formulario._es_cancelar) {
//                                ok.setTxt(tr.in(in, "Cancelado. "));
//                                break;
//                            }
//                            Double doble = (Double) actualizado_control_entrada.valor_de_conversion;
//                            int fila_num = doble.intValue() - 1; // Quitar la cabecera de la tabla
//                            LinkedHashMap<String, Object> columnas_mapa;
//                            columnas_mapa = lecturas_lista.get(fila_num);
//                            List<Entry<String, Object>> entrys_lista = new LinkedList<>();
//                            for (Entry<String, Object> entry: columnas_mapa.entrySet()) {
//                                entrys_lista.add(entry);
//                            }
//                            Entry<String, Object> extra_entry = new SimpleEntry<>(k_insercion_clave_revisar, 1);
//                            entrys_lista.add(extra_entry);
//                            extra_entry = new SimpleEntry<>(k_insercion_clave_enviar, 0);
//                            entrys_lista.add(extra_entry);
//                            if (ok.es == false) { break; }
//                            insercion_web_formulario.importar_valores(entrys_lista, ok, extras_array);
//                            if (ok.es == false) { break; }
//                            insercion_web_formulario.procesar(ok, extras_array);
//                            if (ok.es == false) { break; }
//                            if (insercion_web_formulario._es_terminar) {                                
//                                entrys_lista = insercion_web_formulario.exportar_valores(ok, extras_array);
//                                if (ok.es == false) { break; }
//                                LinkedList<Object> valores_lista = new LinkedList<>();
//                                for (Entry<String, Object> entry : entrys_lista) {
//                                    if (entry.getValue() == null) {
//                                        valores_lista.add(null);
//                                    } else if (entry.getValue().toString().isBlank()) {
//                                        valores_lista.add(null);
//                                    } else {
//                                        valores_lista.add(entry.getValue());
//                                    }
//                                }
//                                actualizar_fila(valores_lista, fila_num, ok);
//                                if (ok.es == false) { break; }
//                            }
//                        }
//                        case k_borrar -> {
//                            es_repetir_interno = true;
//                            borrado_web_formulario.procesar(ok, extras_array);
//                            if (ok.es == false) { break; }
//                            if (borrado_web_formulario._es_terminar) {
//                                Double doble = (Double) borrado_control_entrada.valor_de_conversion;
//                                int fila_num = doble.intValue();
//                                borrar_fila(fila_num, ok);
//                                if (ok.es == false) { break; }
//                                escribir_linea(tr.in(in, "Fila borrada con éxito. "), ok, extras_array);
//                            }
//                        }
//                        default -> {
//                            escribir_linea_error(tr.in(in, "Opción no válida. "), ok, extras_array);
//                            es_repetir_interno = true;
//                        }
//}
//                        if (es_repetir_interno == false) {
//                            break;
//                        }
//                    }
//                    if (ok.es == false) {
//                        break;
//                    }
//                    if (es_repetir_externo == false) {
//                        break;
//                    }
//                }
//                oks ok_fin = new oks();
//                terminar(ok_fin);
//                if (ok_fin.es == false) {
//                    ok.setTxt(ok.getTxt(), ok_fin.getTxt());
//                }
//            }
//            return ok.es;
//        } catch (Exception e) {
//            throw e;
//        }
//    }
    /**
     * Crea el formulario de presentación de una página de una consulta de lectura.
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean crear_formulario_lectura(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in = null;
        try {
            in = ResourceBundles.getBundle(k_in_ruta);
            lectura_control_tabla.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            Map<String, Object> opciones_mapa = new HashMap<>();
            opciones_mapa.put(k_control_tablas_opciones_mapa_lista, lectura_control_tabla.crear_tabla_vacia(ok, extra_array));
            if (ok.es == false) { return ok.es; }
            opciones_mapa.put(k_control_tablas_opciones_mapa_tabla_fragmento, k_fragmento_tabla);
            opciones_mapa.put(k_control_tablas_opciones_mapa_tabla_fila_fragmento, k_fragmento_tabla_fila);
            lectura_control_tabla.poner_en_formulario(lectura_web_formulario, k_lectura_clave_tabla, null, tr.in(in, "Tabla de criptomonedas "), opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            paginacion_retroceder_boton_control_entrada.iniciar(k_entradas_tipo_submit, ok);
            if (ok.es == false) { return ok.es; }
            paginacion_retroceder_boton_control_entrada.poner_en_formulario(lectura_web_formulario, k_paginacion_clave_fila_num
            , null, tr.in(in,"Retroceder"), null, ok);
            if (ok.es == false) { return ok.es; }
            paginacion_avanzar_boton_control_entrada.iniciar(k_entradas_tipo_submit, ok);
            if (ok.es == false) { return ok.es; }
            paginacion_avanzar_boton_control_entrada.poner_en_formulario(lectura_web_formulario, k_paginacion_clave_fila_num
            , null, tr.in(in,"Avanzar"), null, ok);
            if (ok.es == false) { return ok.es; }
            paginacion_ir_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            paginacion_ir_control_entrada.poner_en_formulario(lectura_web_formulario, k_paginacion_clave_fila_num
            , null, tr.in(in,"Ir a fila"), null, ok);
            if (ok.es == false) { return ok.es; }
            paginacion_ir_boton_control_entrada.iniciar(k_entradas_tipo_submit, ok);
            if (ok.es == false) { return ok.es; }
            paginacion_ir_boton_control_entrada.poner_en_formulario(lectura_web_formulario, k_paginacion_clave_fila_num
            , null, tr.in(in,"Ir a fila"), null, ok);
            paginacion_crear_boton_control_entrada.iniciar(k_entradas_tipo_submit, ok);
            if (ok.es == false) { return ok.es; }
            paginacion_crear_boton_control_entrada.poner_en_formulario(lectura_web_formulario, k_paginacion_clave_fila_num
            , null, tr.in(in,"Crear"), null, ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            throw e;
        }
        return ok.es;
    }
    /**
     * Crea el formulario de actualización.
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean crear_formulario_actualizar(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in = null;
        try {
            in = ResourceBundles.getBundle(k_in_ruta);
            actualizado_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            actualizado_control_entrada.poner_en_formulario(actualizado_web_formulario, k_borrado_clave_fila_num
            , null, tr.in(in, "¿Número de fila que actualizar? "), null, ok);
            if (ok.es == false) { return ok.es; }
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            throw e;
        }
        return ok.es;
    }
    /**
     * Crea el formulario de borrado.
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean crear_formulario_borrado(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in = null;
        try {
            in = ResourceBundles.getBundle(k_in_ruta);
            borrado_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            borrado_control_entrada.poner_en_formulario(borrado_web_formulario, k_borrado_clave_fila_num
            , null, tr.in(in, "¿Número de fila que borrar? "), null, ok);
            if (ok.es == false) { return ok.es; }
            borrado_control_entrada_confirmar.iniciar(k_entradas_tipo_submit, ok);
            if (ok.es == false) { return ok.es; }
            borrado_control_entrada_confirmar.poner_en_formulario(borrado_web_formulario, k_borrado_clave_confirmar
            , null, tr.in(in, "¿Está seguro? "), null, ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            throw e;
        }
        return ok.es;
    }
    /**
     * Crea el formulario de paginación de una página de una consulta de lectura.
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean crear_formulario_insercion(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in = null;
        try {
            in = ResourceBundles.getBundle(k_in_ruta);
            control_entradas insercion_id_criptomoneda_control_entrada = new control_entradas();
            control_entradas insercion_simbolo_control_entrada = new control_entradas();
            control_entradas insercion_capitalizacion_de_mercado_control_entrada = new control_entradas();
            control_entradas insercion_aporte_circulante_control_entrada = new control_entradas();
            control_entradas insercion_capitalizacion_total_diluida_control_entrada = new control_entradas();
            control_entradas insercion_aporte_total_control_entrada = new control_entradas();
            control_entradas insercion_aporte_maximo_control_entrada = new control_entradas();
            control_entradas insercion_dominancia_control_entrada = new control_entradas();
            control_entradas insercion_total_valor_bloqueado_control_entrada = new control_entradas();
            control_entradas insercion_revisar_control_entrada = new control_entradas();
            control_entradas insercion_enviar_control_entrada = new control_entradas();
            String [] columnas_array = select_columnas_cabecera_tex.split(",");
            insercion_id_criptomoneda_control_entrada.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            insercion_simbolo_control_entrada.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            insercion_capitalizacion_de_mercado_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_aporte_circulante_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_capitalizacion_total_diluida_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_aporte_total_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_aporte_maximo_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_dominancia_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_total_valor_bloqueado_control_entrada.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            insercion_revisar_control_entrada.iniciar(k_entradas_tipo_reset, ok);
            if (ok.es == false) { return ok.es; }
            insercion_enviar_control_entrada.iniciar(k_entradas_tipo_submit, ok);
            if (ok.es == false) { return ok.es; }
            insercion_id_criptomoneda_control_entrada.poner_en_formulario(insercion_web_formulario, columnas_array[0]
            , null, columnas_array[0], null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_simbolo_control_entrada.poner_en_formulario(insercion_web_formulario, columnas_array[1]
            , null, columnas_array[1], null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_capitalizacion_de_mercado_control_entrada.poner_en_formulario(insercion_web_formulario, columnas_array[2]
            , null, columnas_array[2], null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_aporte_circulante_control_entrada.poner_en_formulario(insercion_web_formulario, columnas_array[3]
            , null, columnas_array[3], null, ok);
            if (ok.es == false) { return ok.es; }
            Map<String, Object> opciones_mapa = new HashMap<>();
            opciones_mapa.put(k_opciones_mapa_no_requerido, "");
            insercion_capitalizacion_total_diluida_control_entrada.poner_en_formulario(insercion_web_formulario, columnas_array[4]
            , null, columnas_array[4], opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            insercion_aporte_total_control_entrada.poner_en_formulario(insercion_web_formulario, columnas_array[5]
            , null, columnas_array[5], opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            insercion_aporte_maximo_control_entrada.poner_en_formulario(insercion_web_formulario, columnas_array[6]
            , null, columnas_array[6], opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            insercion_dominancia_control_entrada.poner_en_formulario(insercion_web_formulario, columnas_array[7]
            , null, columnas_array[7], null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_total_valor_bloqueado_control_entrada.poner_en_formulario(insercion_web_formulario, columnas_array[8]
            , null, columnas_array[8], opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            insercion_revisar_control_entrada.poner_en_formulario(insercion_web_formulario, k_insercion_clave_revisar
            , null, "¿Desea revisarlo? ", null, ok);
            if (ok.es == false) { return ok.es; }
            insercion_enviar_control_entrada.poner_en_formulario(insercion_web_formulario, k_insercion_clave_enviar
            , null, tr.in(in, "¿Enviar? "), null, ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            throw e;
        }
        return ok.es;
    }
    /**
     * Llena el formulario de presentación de una página de una consulta de lectura.
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean cargar_tabla(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in = null;
        try {
            lectura_control_tabla.cargar_tabla(lecturas_textos_lista, ok, extra_array);
        } catch (Exception e) {
            throw e;
        }
        return ok.es;
    }
    
    public boolean leer_pagina_criptomonedas(Long inicio_pos, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        ResourceBundle in = null;
        try {
            sql_comandos sql_comando = new sql_comandos();
            sql_comando.iniciar(driver, conexion, ok);
            if (ok.es == false) { return false; }
            sql_comando.leer_crear_lectura_columnas_lista(select_columnas_tex, ok);
            if (ok.es == false) { return false; }
            sql_comando.leer_iniciar(select, ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.leer_poner_valor(inicio_pos, ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.leer_poner_valor(Integer.valueOf(select_pagina_tam), ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.iniciar(url, usuario, clave, ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando = cliente_jdbc_servidor_https_spring.leer(sql_comando, ok, extra_array);
            if (ok.es == false) { return false; }
            lecturas_lista = sql_comando.leer_lecturas_lista(ok, extra_array);
            if (ok.es == false) { return false; }
            lecturas_textos_lista = _pasar_a_texto_segun_tipo(sql_comando.leer_lecturas_lista_con_tipo_valor(ok), ok);
            if (ok.es == false) { return false; }
            return ok.es;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Long leer_cuenta_filas_criptomonedas(Long inicio_pos, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return null; }
        ResourceBundle in = null;
        try {
            sql_comandos sql_comando = new sql_comandos();
            sql_comando.iniciar(driver, conexion, ok);
            if (ok.es == false) { return null; }
            sql_comando.leer_iniciar(select_count, ok, extra_array);
            if (ok.es == false && ok.id.equals(k_sql_comandos_marcador_columnas_lista_error) == false) {
                return null; 
            } else {
                ok.iniciar();
            }
            sql_comando.leer_crear_lectura_columnas_lista(k_columna_cuenta_tex, ok, extra_array);
            if (ok.es == false) { return null; }
            cliente_jdbc_servidor_https_spring.iniciar(url, usuario, clave, ok, extra_array);
            if (ok.es == false) { return null; }
            sql_comando = cliente_jdbc_servidor_https_spring.leer(sql_comando, ok, extra_array);
            if (ok.es == false) { return null; }
            tipos_valores tipo_valor = sql_comando.lecturas_lista.get(0).get(k_columna_cuenta_tex);
            return ((BigDecimal) tipo_valor.valor).longValue();
        } catch (Exception e) {
            throw e;
        }
    }
    /**
     * Crea una fila
     * @param valores_lista
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean crear_fila(LinkedList<Object> valores_lista, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        ResourceBundle in = null;
        try {
            String id = null;
            sql_comandos sql_comando = new sql_comandos();
            sql_comando.iniciar(driver, conexion, ok);
            if (ok.es == false) { return false; }
            sql_comando.crear_iniciar(insert, ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(0), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(1), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(2), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(3), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(4), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(5), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(6), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(7), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.crear_poner_valor(valores_lista.get(8), ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.iniciar(url, usuario, clave, ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.crear(sql_comando, ok, extra_array);
            return ok.es;
        } catch (Exception e) {
            throw e;
        }
    }
    /**
     * Actualiza una fila
     * @param valores_lista
     * @param fila_num
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean actualizar_fila(LinkedList<Object> valores_lista, int fila_num, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        ResourceBundle in = null;
        try {
            String id = null;
            sql_comandos sql_comando = new sql_comandos();
            sql_comando.iniciar(driver, conexion, ok);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_iniciar(update, ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_poner_valor(valores_lista.get(0), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_poner_valor(valores_lista.get(1), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_poner_valor(valores_lista.get(2), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_poner_valor(valores_lista.get(3), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_poner_valor(valores_lista.get(4), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_poner_valor(valores_lista.get(5), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_poner_valor(valores_lista.get(6), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_poner_valor(valores_lista.get(7), ok, extra_array);
            if (ok.es == false) { return false; }
            sql_comando.actualizar_poner_valor(valores_lista.get(8), ok, extra_array);
            if (ok.es == false) { return false; }
            LinkedHashMap<String, Object> columnas_mapa;
            columnas_mapa = lecturas_lista.get(fila_num);
            Object object = null;
            for (Object columna : columnas_mapa.values()) {
                object = columna;
                break;
            }
            sql_comando.actualizar_poner_valor(object, ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.iniciar(url, usuario, clave, ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.actualizar(sql_comando, ok, extra_array);
            return ok.es;
        } catch (Exception e) {
            throw e;
        }
    }
    /**
     * Borra una fila
     * @param fila_num
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean borrar_fila(int fila_num, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        ResourceBundle in = null;
        try {
            String id = null;
            LinkedHashMap<String, Object> columnas_mapa;
            sql_comandos sql_comando = new sql_comandos();
            sql_comando.iniciar(driver, conexion, ok);
            if (ok.es == false) { return false; }
            sql_comando.borrar_iniciar(delete, ok, extra_array);
            if (ok.es == false) { return false; }
            columnas_mapa = lectura_control_tabla.leer_fila(fila_num, ok);
            if (ok.es == false) { return false; }
            for (Object object : columnas_mapa.values()) {
                id = object.toString();
                break;
            }
            if (id == null) { return false; }
            sql_comando.borrar_poner_valor(id, ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.iniciar(url, usuario, clave, ok, extra_array);
            if (ok.es == false) { return false; }
            cliente_jdbc_servidor_https_spring.borrar(sql_comando, ok, extra_array);
            return ok.es;
        } catch (Exception e) {
            throw e;
        }
    }

    public LinkedList<LinkedHashMap<String, Object>> _pasar_a_texto_segun_tipo(LinkedList<LinkedHashMap<String, tipos_valores>> filas_lista, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return null; }
        LinkedList<LinkedHashMap<String, Object>> retorno_lista = null;
        ResourceBundle in = null;
        try {
            String texto;
            LinkedHashMap<String, Object> retorno_columnas_mapa;
            retorno_lista = new LinkedList<>();
            for (LinkedHashMap<String, tipos_valores> columnas_mapa: filas_lista) {
                retorno_columnas_mapa = new LinkedHashMap<>();
                for (Entry<String,tipos_valores> entry: columnas_mapa.entrySet()) {
                    texto = entry.getValue().pasar_a_texto_segun_tipo(ok);
                    if (ok.es == false) { break; }
                    retorno_columnas_mapa.put(entry.getKey(), texto);
                }
                if (ok.es == false) { break; }
                retorno_lista.add(retorno_columnas_mapa);
            }
        } catch (Exception e) {
            throw e;
        }
        return retorno_lista;
    }

    public boolean _poner_cabecera(LinkedList<LinkedHashMap<String, Object>> filas_lista, oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return false; }
        try {
            LinkedHashMap<String, Object> cabecera = new LinkedHashMap<>();
            String [] columnas_array;
            columnas_array = select_columnas_cabecera_tex.split(",");
            int i = 0;
            for (String columna: columnas_array) {
                columna = columna.trim();
                cabecera.put(columna, columna);
            }
            filas_lista.addFirst(cabecera); 
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }
    
    public String leer_seleccion(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return null; }
        String texto = null;
        try {
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return texto;
    }
}
