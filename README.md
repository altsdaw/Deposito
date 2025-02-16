🏦 
Proyecto Deposito - Gestión de Cuenta Bancaria
📌 Autor: [alts]
📌 Versión: 1.0
📌 Fecha: 2024
📌 Módulo: Entornos de Desarrollo
📌 Ciclo Formativo: FP Desarrollo de Aplicaciones Web

📖 Descripción
Este proyecto ha sido desarrollado como parte de la Tarea de la Unidad 4: Optimización y Documentación del módulo de Entornos de Desarrollo en el Ciclo Formativo de Grado Superior en Desarrollo de Aplicaciones Web (DAW).

El objetivo del proyecto es aplicar buenas prácticas en el desarrollo de software mediante refactorización, control de versiones con Git y documentación con JavaDoc.

El programa simula una cuenta bancaria, permitiendo realizar ingresos, retiros y mostrando un extracto bancario formateado en tabla.

🛠️ Tecnologías Utilizadas
✅ Lenguaje: Java (JDK 11 o superior)
✅ Entorno de Desarrollo: NetBeans IDE
✅ Control de Versiones: Git y GitHub
✅ Documentación: Javadoc

📂 Estructura del Proyecto
bash
Copiar
Editar
📦 cuentas
 ┣ 📜 CCuenta.java   # Clase que gestiona la cuenta bancaria
 ┣ 📜 Main.java      # Clase principal que ejecuta el programa
 ┣ 📂 dist/javadoc   # Documentación generada con JavaDoc
 ┣ 📜 README.md      # Archivo con información del proyecto
🚀 Cómo Ejecutar el Proyecto
🔹 Requisitos Previos
🔹 Tener instalado Java JDK 11 o superior.
🔹 Tener NetBeans para la ejecución del código.
🔹 Tener Git instalado para clonar el repositorio.

🔹 Pasos de Ejecución
Clonar el repositorio desde GitHub:
sh
Copiar
Editar
git clone https://github.com/tu_usuario/Deposito.git
Abrir el proyecto en NetBeans.
Ejecutar Main.java desde el IDE.
Ver la salida en consola con el extracto bancario.
📜 Ejemplo de Salida en Consola
markdown
Copiar
Editar
========================================
         EXTRACTO BANCARIO              
========================================
Titular  : Antonio López
Cuenta   : 1000-2365-85-1230456789
----------------------------------------
Descripción           Monto      Saldo
----------------------------------------
Saldo inicial            0.00   2500.00
Retiro               2300.00    200.00
Ingreso               685.00    885.00
----------------------------------------
Saldo final                     885.00
========================================
📝 Documentación
Este proyecto ha sido documentado utilizando JavaDoc. La documentación generada se encuentra en:
📂 dist/javadoc/index.html

Puedes regenerar la documentación ejecutando:

sh
Copiar
Editar
javadoc -d dist/javadoc -sourcepath src -subpackages cuentas
🖥️ Control de Versiones con Git
Este proyecto ha sido versionado en Git y GitHub para mantener un historial de cambios.
Puedes ver los commits en la pestaña "Commits" de GitHub.

Para ver el historial de Git localmente, ejecuta:

sh
Copiar
Editar
git log --oneline --graph --all
🎯 Objetivos de la Tarea en el FP
✔ Aplicar refactorización para mejorar la estructura del código.
✔ Implementar control de versiones con Git y GitHub.
✔ Generar documentación con JavaDoc.
✔ Desarrollar código limpio y optimizado.

Este proyecto ha sido diseñado para afianzar las competencias del módulo de Entornos de Desarrollo, dentro del ciclo formativo de FP en Desarrollo de Aplicaciones Web.

📌 Licencia
Este proyecto es de código abierto y se distribuye bajo la licencia MIT.

🌟 Contacto
Si tienes dudas o sugerencias, puedes contactarme en:
📧 Email: [tuemail@ejemplo.com]
🐙 GitHub: [https://github.com/tu_usuario]
