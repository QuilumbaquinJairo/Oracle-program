const button = document.querySelector("button");
const textarea = document.getElementById("ouputTextarea");


button.addEventListener("click", () => {
    if(emptyOrwhitespaces()){
        textarea.value="";
        textarea.setAttribute("placeholder", "Ningún mensaje fue Encontrado");
        textarea.style.backgroundColor="white";

    }else{
        textarea.style.backgroundColor="#D8DFE8";
    }

});

