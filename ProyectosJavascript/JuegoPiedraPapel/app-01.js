let puntos = 0; // se declara fuera del alcance para que no se reinice por cada ejecucion de la 
function validaJuego(jugadorSeleccionado){
    const juego = ["piedra","papel","tijera"]
    let aleatorio = Math.floor(Math.random()*juego.length);

    for(let i=1; i<=5;i++){
        alert(`Intento numero ${i}`)
        const opciones = document.querySelectorAll("select[name='seleccion'] option")
        opciones.forEach((opcion)=>{
            if(opcion.selected){
                if(opcion.value === juego[aleatorio]){
                    puntos++;
                }
            }
        });
    }
    alert('finaliza tu juego!!!!')

    if(jugadorSeleccionado ==="jugador1"){
        document.getElementById("puntos1").value = puntos;
    }else{
        document.getElementById("puntos2").value = puntos;
    }
}

function validaJugadores(){
    const jug1 = document.getElementById("jugador1").value;
    const jug2 = document.getElementById("jugador2").value;
    const seljuega = document.querySelectorAll('input[name="seljug"]');
    let seleccionado = false;
    let jugadorSeleccionado ="";
    if(jug1 ==="" || jug2 ===""){
        alert("Debe ingresar los datos de los jugadores!!!")
    }else{
        seljuega.forEach((opcion)=>{
            if(opcion.checked){
                seleccionado = true;
                jugadorSeleccionado = opcion.value;
            }
        });
    }
    if(!seleccionado){
        alert('Debe indicar el jugador que participara!!!')
    }else{
        alert('Tienes 5 oportunidades, gana el jugador que acumule mas puntos AH JUGAR!!!!!')
        validaJuego(jugadorSeleccionado);
    }
}