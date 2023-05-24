import tkinter as tk

#función
def convertir():
    celcius=float(temp_celsius.get())
    kelvin=celcius+273.15
    far=(celcius*9)/5+32
    etiquetaK=tk.Label(text=f"Temperatura en K: {kelvin}")
    etiquetaK.place(x=20, y=140)
    etiquetaFar=tk.Label(text=f"Temperatura en °F: {far}")
    etiquetaFar.place(x=20, y=100)

#ventana
ventana = tk.Tk()
ventana.title("Convertidor de grados")
ventana.config(width=400, height=300)

#ingresar grados celcius
etiquetaCelcius=tk.Label(text="Temperatura en Celcius")
etiquetaCelcius.place(x=20, y=20)
temp_celsius = tk.Entry()
temp_celsius.place(x=160, y=20, width=60)

#botón para convertir a F y K
boton_convertir = tk.Button(text="Convertir",command=convertir)
boton_convertir.place(x=20, y=60)

ventana.mainloop()


