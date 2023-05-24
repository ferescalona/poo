import tkinter as tk
ventana=tk.Tk()
ventana.geometry('200x400')

etiqueta=tk.Label(ventana,text='')
etiqueta.place(x=80,y=80)

def DesplegarTxt(posAux=0):
    #texto='Iniciando despliegue de información'
    texto=entrada.get()
    etiqueta.configure(text=texto[:posAux+1])
    if(posAux<len(texto)-1):
        etiqueta.after(100,lambda : DesplegarTxt(posAux+1))

entrada=tk.Entry(ventana)
entrada.place(x=30,y=130)

botonIniciar=tk.Button(ventana,text='Iniciar',command=DesplegarTxt)
botonIniciar.place(x=80,y=100)

ventana.mainloop()