public class Principal {
    public static void main(String[] args) {
        System.out.println("=====================================================================");
        System.out.println("   PLATAFORMA EMPRESARIAL PROPTECH: CONTROL INMOBILIARIO Y MADUREZ   ");
        System.out.println("=====================================================================\n");

        
        Cliente cliente1 = new Cliente(1, "Alejandro", "Pérez", "0991234567", "alejandro.perez@mail.com", "Av. Solano, Cuenca");
        Agente agente1 = new Agente(10, "Carlos Daniel", "0987654321", "carlos.daniel@proptech.com", "Bienes Raíces Comerciales");
        Propiedad propiedad1 = new Propiedad(201, "Oficina Corporativa El Ejido", "Oficina con equipamiento de conectividad", 85000.0, "Sector El Ejido, Cuenca", "Oficina", "Disponible");
        Venta venta1 = new Venta(5001, "2026-05-31", 85000.0, "Completada");
        Renta renta1 = new Renta(6001, "2026-06-01", "2027-06-01", 450.0, "Pendiente de Firma");

       
        propiedad1.setPrecio(82000.0); 

    
        System.out.println("--- [FASE 1: OPERACIONES BÁSICAS DEL NEGOCIO] ---");
        cliente1.registrarse();
        agente1.gestionarCliente(cliente1);
        propiedad1.mostrarInformacion();
        propiedad1.actualizarEstado("Vendida");
        venta1.generarVenta();
        renta1.generarContrato();
        System.out.println();


        EvaluacionMadurezDigital evaluacionAnual = new EvaluacionMadurezDigital(101, "2026-05-31", 90.0, 85.0, 70.0, 65.0);
        
        IndicadorDigital kpi1 = new IndicadorDigital(1, "Tasa de Adopción de CRM", "Porcentaje de leads gestionados mediante software", 90.0, 80.0, "Gestión Interna");
        IndicadorDigital kpi2 = new IndicadorDigital(2, "Cierre con Firma Electrónica", "Porcentaje de contratos cerrados remotamente", 65.0, 75.0, "Operaciones");

      
        evaluacionAnual.setPuntajeFirmaElectronica(68.0); 

      
        System.out.println("--- [FASE 2: DIAGNÓSTICO DE TRANSFORMACIÓN DIGITAL] ---");
        System.out.println("Auditoría de Procesos Tecnológicos realizada el: " + evaluacionAnual.getFechaEvaluacion());
        System.out.println("Promedio Consolidado de Digitalización: " + evaluacionAnual.calcularPromedio() + "%");
        System.out.println("Clasificación de Madurez: " + evaluacionAnual.obtenerNivelMadurezDigital());
        System.out.println();
        
        
        System.out.println("--- [FASE 3: PANEL DE CONTROL DE INDICADORES (DASHBOARD)] ---");
        kpi1.mostrarEstadoIndicador();
        kpi2.mostrarEstadoIndicador();
        System.out.println("====================================================================");
    }
}