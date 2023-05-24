import tkinter as tk
from PIL import Image, ImageTk
import time

#Crear ventana 800x800
ventana = tk.Tk()
ventana.title("Juego siuuu")
ventana.geometry("800x800")

#atributos del personaje
global salud
global energia

salud=5000
etiquetaSalud = tk.Label(ventana, text="Salud: "+str(salud))
etiquetaSalud.grid(column=0,row=0, columnspan=3)

energia=2000
etiquetaEnergia = tk.Label(ventana, text="Energía: "+str(energia))
etiquetaEnergia.grid(column=0,row=1, columnspan=3)

#bandera para turnos
#verdadero: ataca personaje 1 (izquierda). Falso: ataca personaje 2 (derecha)
bandera = True 

#insertar imagen
imagenSource = Image.open('C:/Users/Probook/Downloads/pk1.jpg')
#Reescalar
imagenSource = imagenSource.resize((300,300))
#declarar como objeto
gkmc = ImageTk.PhotoImage(imagenSource)
#crear etiqueta para mostrar imagen
labelgkmc = tk.Label(ventana, image=gkmc)
labelgkmc.grid(padx=50,column=0,row=2,columnspan=3)

#mensaje de victoria
victoria1 = tk.Label(ventana, text="")
victoria1.grid(column=0, row=5, columnspan=3)

#funciones botones
def atake1():
    global salud2
    global energia
    global bandera
    if(bandera==True):
        salud2=salud2-2500
        etiquetaSalud2.config(text="Salud: "+str(salud2))
        energia=energia-50
        etiquetaEnergia.config(text="Energía: "+str(energia))
        bandera=False
        if(salud2<=0):
           victoria1.config(text="Gana jugador 1")
        if(energia2<=0):
           victoria1.config(text="Gana jugador 1")
    else:
        error1 = tk.Label(ventana, text="Error, turno del jugador 2")
        error1.grid(pady=20,column=0,row=4,columnspan=3)

def atake2():
    global salud2
    global energia
    global bandera
    if(bandera==True):
        salud2=salud2-2500
        etiquetaSalud2.config(text="Salud: "+str(salud2))
        energia=energia-50
        etiquetaEnergia.config(text="Energía: "+str(energia))
        bandera=False
        if(salud2<=0):
           victoria1.config(text="Gana jugador 1")
        if(energia2<=0):
           victoria1.config(text="Gana jugador 1")
    else:
        error1 = tk.Label(ventana, text="Error, turno del jugador 2")
        error1.grid(pady=20,column=0,row=4,columnspan=3)

def atake3():
    global salud2
    global energia
    global bandera
    if(bandera==True):
        salud2=salud2-2500
        etiquetaSalud2.config(text="Salud: "+str(salud2))
        energia=energia-50
        etiquetaEnergia.config(text="Energía: "+str(energia))
        bandera=False
        if(salud2<=0):
           victoria1.config(text="Gana jugador 1")
        if(energia2<=0):
           victoria1.config(text="Gana jugador 1")
    else:
        error1 = tk.Label(ventana, text="Error, turno del jugador 2")
        error1.grid(pady=20,column=0,row=4,columnspan=3)

#botones
ataque1 = tk.Button(ventana, text = "atq1",command=atake1)
ataque1.grid(column=0,row=3)
ataque2 = tk.Button(ventana, text = "atq2",command=atake2)
ataque2.grid(column=1,row=3)
ataque3 = tk.Button(ventana, text = "atq3",command=atake3)
ataque3.grid(column=2,row=3)

#espacio en medio para separar imagenes
espacio = tk.Label(ventana, text = "")
espacio.grid(column=4, row=0, rowspan=4)

#atributos
global salud2
global energia2

salud2=5000
etiquetaSalud2 = tk.Label(ventana, text="Salud: "+str(salud2))
etiquetaSalud2.grid(column=5,row=0,columnspan=3)

energia2=2000
etiquetaEnergia2 = tk.Label(ventana, text="Energía: "+str(energia2))
etiquetaEnergia2.grid(column=5,row=1,columnspan=3)

#imagen
imagenSource2 = Image.open('C:/Users/Probook/Downloads/pk2.jpg')
imagenSource2 = imagenSource2.resize((300,300))
mpl = ImageTk.PhotoImage(imagenSource2)
labelmpl = tk.Label(ventana, image=mpl)
labelmpl.grid(padx=50,column=5,row=2,columnspan=3)

#mensaje de victoria
victoria2 = tk.Label(ventana, text="")
victoria2.grid(column=5, row=5, columnspan=3)

#ataque 4 5 y 6, para jugador 2
def atake4():
    global salud
    global energia2
    global bandera
    if(bandera==False):
        salud=salud-5000
        etiquetaSalud.config(text="Salud: "+str(salud))
        energia2=energia2-50
        etiquetaEnergia2.config(text="Energía: "+str(energia2))
        bandera=True
        if(salud<=0):
           victoria2.config(text="Gana el jugador 2")
        if(energia<=0):
            victoria2.config(text="Gana el jugador 2")
    else:
        error2 = tk.Label(ventana, text="Error, turno del jugador 1")
        error2.grid(pady=20,column=5,row=4,columnspan=3)

def atake5():
    global salud
    global energia2
    global bandera
    if(bandera==False):
        salud=salud-5000
        etiquetaSalud.config(text="Salud: "+str(salud))
        energia2=energia2-50
        etiquetaEnergia2.config(text="Energía: "+str(energia2))
        bandera=True
        if(salud<=0):
           victoria2.config(text="Gana el jugador 2")
        if(energia<=0):
           victoria2.config(text="Gana el jugador 2")
    else:
        error2 = tk.Label(ventana, text="Error, turno del jugador 1")
        error2.grid(pady=20,column=5,row=4,columnspan=3)

def atake6():
    global salud
    global energia2
    global bandera
    if(bandera==False):
        salud=salud-5000
        etiquetaSalud.config(text="Salud: "+str(salud))
        energia2=energia2-50
        etiquetaEnergia2.config(text="Energía: "+str(energia2))
        bandera=True
        if(salud<=0):
           victoria2.config(text="Gana el jugador 2")
        if(energia<=0):
           victoria2.config(text="Gana el jugador 2")
    else:
        error2 = tk.Label(ventana, text="Error, turno del jugador 1")
        error2.grid(pady=20,column=5,row=4,columnspan=3)

#botones
ataque4 = tk.Button(ventana, text = "atq1",command=atake4)
ataque4.grid(column=5,row=3)
ataque5 = tk.Button(ventana, text = "atq2",command=atake5)
ataque5.grid(column=6,row=3)
ataque6 = tk.Button(ventana, text = "atq3",command=atake6)
ataque6.grid(column=7,row=3)

ventana.mainloop()