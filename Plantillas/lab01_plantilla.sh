#=======================================================
# Variables globales
#=======================================================

declare -a libreriass
declare -a parametros
declare parametros_constructor=""
declare cuerpo_constructor=""
declare -a setter_and_getters
declare nombre_archivo=""

solicitar_librerias(){
	local lib
	echo "Seleccione que librerias desea utilizar(y = yes | n = no): "
	
	read -p "ArrayList: " lib

	if [[ "$lib" == "y" ]]; then
		librerias+=("import java.util.ArrayList;\n")
	fi

	read -p "LocalTime: " lib

	if [[ "$lib" == "y" ]]; then
		librerias+=("import java.time.LocalTime;\n")
	fi

	read -p "TimeDate: " lib

	if [[ "$lib" == "y" ]]; then
		librerias+=("import java.util.Date;\n")
	fi

	read -p "SimpleDateFormat: " lib

	if [[ "$lib" == "y" ]]; then
		librerias+=("import java.text.SimpleDateFormat;\n")
	fi
}

#=======================================================

solicitar_atributos(){
	echo "Ingrese exit para dejar de insertar Atributos"
	local tipo=""
	while true ;do
		read -p "Ingresa el tipo de la Variable: " tipo
		if [ "$tipo" == "exit" ]; then
			parametros_constructor=${parametros_constructor%,}                 # elimina el `;`
			break
		fi
		read -p "Ingresa el nombre de la variable: " nombre
		# Creacion del constructor
		parametros+="\tprivate $tipo $nombre;\n"
		parametros_constructor="$parametros_constructor, $tipo $nombre"
		cuerpo_constructor="$cuerpo_constructor\n\t\tthis.$nombre = $nombre;" # Posible modificacion
		setter_and_getters+="\tpublic void set${nombre^}($tipo $nombre){\n\t\tthis.$nombre = $nombre;\n\t}\n"
		setter_and_getters+="\tpublic $tipo get${nombre^}(){\n\t\t return this.$nombre;\n\t}\n"

	done
}
#=======================================================
crear_archivo(){
	local archivo=$(echo "$nombre_archivo.java")
	#echo "$archivo"
	#length=${#my_array[@]}
	{
		for (( i = 0; i < ${#librerias[@]}; i++ )); do
			echo -en "${librerias[$i]}"
		done
		echo  -e "\npublic class $nombre_archivo {\n"
		for (( i = 0; i < ${#parametros[@]}; i++ )); do
			echo -e "${parametros[i]}"
		done

		echo -e "\tpublic $nombre_archivo( ${parametros_constructor#,} ){$cuerpo_constructor\n\t}"
		echo -e "${setter_and_getters[@]}\n}"
	} >> "$archivo"
}

#=======================================================
read -p "Ingrese el nombre de la clase: " nombre_archivo
#archio="$archivo.java"
if [ -f "$nombre_archivo.java" ]; then
    echo "La clase ya existe y se va a eliminar"
    rm "$nombre_archivo.java"
fi

touch "$nombre_archivo.java"

solicitar_librerias
solicitar_atributos
crear_archivo