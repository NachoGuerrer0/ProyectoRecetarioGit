document.addEventListener('DOMContentLoaded',function(){
    const botonAgregarIngrediente = document.getElementById('agregar-ingrediente');
    const contenedorIngredientes = document.getElementById('contenedor-ingredientes');

    botonAgregarIngrediente.addEventListener('click', function(event){
        event.preventDefault();
        agregarCampoIngrediente();
    });

function agregarCampoIngrediente(){
    const nuevoCampo = document.createElement('div');
    nuevoCampo.innerHTML =`
    <input type="text" name="ingrediente" placeholder="Ingrediente" required>
        <input type="text" name="cantidad" placeholder="Cantidad" required>
        `;
    contenedorIngredientes.appendChild(nuevoCampo);
}

//Agregar funcionalidad para que se solicite la cantidad al ingresar un ingrediente

const inputIngrediente = document.getElementsByName('ingrediente');
for (let i = 0; i < inputIngrediente.length; i++){
    inputIngrediente[i].addEventListener('change', function(){
        const inputCantidad = document.createElement('input');
        inputCantidad.type = 'text';
        inputCantidad.name = 'cantidad';
        inputCantidad.placeholder = 'Cantidad';
        inputCantidad.required = true;
        this.parentNode.appendChild(inputCantidad);
    })
}

//javascript Mi cuenta

document.addEventListener('DOMContentLoaded', function(){
    //funcion cargar informacion usuario
    function cargarInformacionUsuario(){
        const infoUsuario ={
            nombre: "",
            correo: ""
        };

        const contenedorInfo = document.getElementById('mi-cuenta-info');
        contenedorInfo.innerHTML = `
        <p><strong>Nombre: </strong> ${infoUsuario.nombre}</p>
        <p><strong>Correo: </strong> ${infoUsuario.correo}</p>
        `;
    }

    //funcion cambiar contraseña
    function cambiarContrasena(){
        const nuevaContrasena = document.getElementById('nueva-contasena').value;
        //realizar peticion enviar nueva contraseña
        console.log("Nueva contraseña: ", nuevaContrasena);
    }

    //funcion recetas subidas
    function listarRecetasSubidas(){
        //obtener contenedor para recetas subidas
        const contenedorRecetas = document.getElementById('recetas-subidas');

        //limpiar contenedor antes de agregar nuevas recetas
        contenedorRecetas.innerHTML = '';

        //verificar si hay recetas subidas
        if (listarRecetasSubidas.length ===0){
            //si no hay recetas, muestra mensaje indicando que no hay
            contenedorRecetas.innerHTML = '<p>No has subido ninguna receta aún</p>'
        } else {
            //si hay recetas las mostrará
            listarRecetasSubidas.forEach(receta => {
                const elementoReceta = document.createElement('div');
                elementoReceta.classList.add('receta');
                elementoReceta.innerHTML = `<p>${receta.nombre}</p>`;
                contenedorRecetas.appendChild(elementoReceta);
            });
        }
    }

    //funcion eliminar cuenta
    function eliminarCuenta(){
        console.log("Eliminar cuenta");
    }

    //llamar funciones al cargar la pagina
    cargarInformacionUsuario();
    listarRecetasSubidas();

    //event listeners para los botones y elementos interactivos
    document.getElementById('cambiar-contrasena-btn').addEventListener('click', cambiarContrasena);
    document.getElementById('eliminar-cuenta-btn').addEventListener('click', eliminarCuenta);
})

//javascript Buscar Receta
document.addEventListener('DOMContentLoaded',function(){
    const formularioBusqueda = document.getElementById('formulario-busqueda');
    const resultadoBusqueda = document.getElementById('resultado-busqueda');

    formularioBusqueda.addEventListener('submit', function(event){
        event.preventDefault();
        buscarRecetas();
    });

    function buscarRecetas(){
        //obtener los valores de los campos de busqueda
        const tipoCoccion = document.getElementById('tipo-coccion').value;
        const ingrediente = document.getElementById('ingrediente').value;

        //filtrar resultados de la busqueda
        const resultadosFiltrados = resultados.filter(receta => {
            return (tipoCoccion === 'todos' || receta.tipoCoccion === tipoCoccion) &&
                    (ingrediente === '' || receta.ingredientes.includes(ingrediente.toLowerCase()));
        });

        //mostrar resultados en el contenedor
        mostrarResultados(resultadosFiltrados);
    }

    function mostrarResultados(resultados){
        resultadoBusqueda.innerHTML = '';

        if (resultados.length ===0){
            resultadoBusqueda.innerHTML = '<p>No se encontraron recetas que coincidan con los criterios de busqueda</p>';
        } else {
            const listaRecetas = document.createElement('ul');
            resultados.forEach(receta => {
                const itemReceta = document.createElement('li');
                itemReceta.textContent = receta.nombre;
                listaRecetas.appendChild(itemReceta);
            });
            resultadoBusqueda.appendChild(listaRecetas);
        }
    }
})
});