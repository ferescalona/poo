import tkinter as tk

#función celcius
def convertir():
    celcius=float(temp_celsius.get())
    far=(celcius*9)/5+32
    etiquetaFar=tk.Label(text=f"Temperatura en °F: {far}")
    etiquetaFar.grid(column=0,row=3,padx=20,pady=20)
    kelvin=celcius+273.15
    etiquetaK=tk.Label(text=f"Temperatura en K: {kelvin}")
    etiquetaK.grid(column=0,row=4,padx=20,pady=20)

#función kelvin
def convertirK():
    kelvin=float(temp_kelvin.get())
    celcius=kelvin-273.15
    etiquetaKelvin=tk.Label(text=f"Temperatura en °C: {celcius}")
    etiquetaKelvin.grid(column=1,row=3,padx=20,pady=20)
    far=(celcius*9)/5+32
    etiquetaFar=tk.Label(text=f"Temperatura en °F: {far}")
    etiquetaFar.grid(column=1,row=4,padx=20,pady=20)

#función far
def convertirF():
    far=float(temp_Far.get())
    celcius=(far-32)*5/9
    etiquetaFar=tk.Label(text=f"Temperatura en °C: {celcius}")
    etiquetaFar.grid(column=2,row=3,padx=20,pady=20)
    kelvin=celcius+273.15
    etiquetaKelvin=tk.Label(text=f"Temperatura en K: {kelvin}")
    etiquetaKelvin.grid(column=2,row=4,padx=20,pady=20)

#ventana
ventana = tk.Tk()
ventana.title("Convertidor de grados")
ventana.config(width=900, height=900)
ventana.configure(background='#A4A4A4')

#ingresar grados celcius
etiquetaCelcius=tk.Label(text="Temperatura en Celcius",font=("Arial", 10))
temp_celsius = tk.Entry()
etiquetaCelcius.grid(column=0,row=0,padx=20,pady=20)
temp_celsius.grid(column=0,row=1,padx=20,pady=20)
boton_convertir = tk.Button(text="Convertir",command=convertir,font=("Arial", 10), fg='blue',highlightbackground='blue')
boton_convertir.grid(column=0,row=2,padx=20,pady=20)
#ingresar grados Kelvin
etiquetaKelvin=tk.Label(text="Temperatura en Kelvin",font=("Arial", 10))
temp_kelvin = tk.Entry()
etiquetaKelvin.grid(column=1,row=0,padx=20,pady=20)
temp_kelvin.grid(column=1,row=1,padx=20,pady=20)
boton_convertirK = tk.Button(text="Convertir",command=convertirK,font=("Arial", 10), fg='blue',highlightbackground='blue')
boton_convertirK.grid(column=1,row=2,padx=20,pady=20)
#ingresar grados Far
etiquetaFar=tk.Label(text="Temperatura en Fahrenheit",font=("Arial", 10))
temp_Far = tk.Entry()
etiquetaFar.grid(column=2,row=0,padx=20,pady=20)
temp_Far.grid(column=2,row=1,padx=20,pady=20)
boton_convertirF = tk.Button(text="Convertir",command=convertirF,font=("Arial", 10), fg='blue',highlightbackground='blue')
boton_convertirF.grid(column=2,row=2,padx=20,pady=20)

ventana.mainloop()