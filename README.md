# Literalura 📚
Challenge de practica programa Alura Latam

**Literalura** es una aplicación que permite consultar libros utilizando la [API de Gutendex](https://gutendex.com/). Con esta aplicación, puedes explorar una gran cantidad de libros, filtrar resultados y acceder a información detallada sobre cada obra. Ideal para lectores y amantes de la literatura.

## Funcionalidades ✨

- 🔍 **Búsqueda de libros**: Encuentra libros por título, autor o género.
- 📖 **Detalles de los libros**: Muestra información como título, autor, año de publicación y descripción.
- 🌐 **Conexión con Gutendex**: Utiliza la API pública para acceder a una base de datos amplia de libros gratuitos.
- 💾 **Persistencia local**: Guarda tus libros favoritos en una base de datos local.
- 📋 **Exportar datos**: Exporta datos seleccionados en formato CSV para usarlos en otras aplicaciones.

## Tecnologías utilizadas 🛠️

- **Backend**: Spring Boot, Hibernate, PostgreSQL
- **Frontend**: Thymeleaf
- **API**: [Gutendex](https://gutendex.com/)
- **Base de datos**: H2 para pruebas locales, PostgreSQL para producción
- **Java**: Versión 21

## Requisitos previos 📋

Antes de comenzar, asegúrate de tener instalado:

- [Java 21](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/)
- [PostgreSQL](https://www.postgresql.org/) o cualquier otra base de datos compatible con JPA

## Instalación 🚀

1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/literalura.git
   cd literalura
   
## Menú principal de la aplicación 📋

La aplicación **Literalura** cuenta con un menú principal interactivo que permite realizar diferentes operaciones relacionadas con libros y autores. Aquí están las opciones disponibles:

1. **Buscar libro por título**: Permite buscar un libro específico ingresando su título. La aplicación se conectará a la API de Gutendex para realizar la búsqueda y mostrar los resultados.

2. **Listar libros registrados**: Muestra una lista de todos los libros registrados en la base de datos local.

3. **Listar autores registrados**: Presenta un listado de todos los autores registrados en la base de datos local.

4. **Listar autores vivos en un año**: Permite listar autores que estaban vivos en un año específico. El usuario deberá ingresar el año deseado para ver los resultados.

5. **Listar libros por idioma**: Filtra los libros registrados en la base de datos por su idioma.

0. **Salir**: Cierra la aplicación.

Este menú facilita la navegación y el acceso rápido a las funcionalidades principales de la aplicación.

## Demostración 🎥

[![Mira la demostración del menú aquí](https://img.youtube.com/vi/ID_DEL_VIDEO/hqdefault.jpg)](https://youtu.be/FShXvWYThK4)

![Pantalla principal](./screenshots/pantalla_principal.png)

