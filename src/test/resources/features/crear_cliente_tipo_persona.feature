# language: es

Característica: Crea cliente tercero tipo persona
  Como usuario
  Quiero ir a la pagina de crear usuario
  Para crear un cliente tercero tipo persona

  Escenario: Crear cliente tipo persona exitoso
    Dado que el usuario esta en la pagina crear un tercero
    Cuando el usuario completa el formulario con los datos del cliente y guarda
    Entonces debe ser redirigido a una pagina con un que coniene el nombre del cliente y estado activo