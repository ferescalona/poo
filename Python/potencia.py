import tkinter as tk
ventana = tk.Tk()
ventana.title("Potencia")
ventana.geometry("400x400")

#label1
label1=tk.Label(ventana,text="Ingresa tu potencia")
label1.grid(column=0,row=0,padx=20,pady=20)

#label2
label2=tk.Label(ventana,text="Ingresa tu numero")
label2.grid(column=1,row=0,padx=20,pady=20)

#entry1
potencia=tk.Entry(ventana)
potencia.insert(0,"2")
potencia.grid(column=0,row=1,padx=20,pady=20)

numero=tk.Entry(ventana)
numero.insert(0,"2")
numero.grid(column=1,row=1,padx=20,pady=20)

def Potencia():
    n=int(numero.get())
    p=int(potencia.get())
    r=pow(n,p)
    result.config(text=f"Tu potencia de {n} elevado a la {p} es {r}")

boton=tk.Button(ventana,text="Aceptar",command=Potencia)
boton.grid(column=1,row=2,padx=20,pady=20)


result=tk.Label(ventana,text="")
result.grid(column=0,row=2,padx=20,pady=20)



ventana.mainloop()

