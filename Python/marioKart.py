import tkinter as tk
from PIL import Image, ImageTk
#ventana
ventana = tk.Tk()
ventana.title("Mario kart")
ventana.config(width=850, height=850)

#-------------------bowser-------------------------------------------
imagenSource=Image.open('C:/Users/Probook/Downloads/Bowser1.png')
imagenSource=imagenSource.resize((250,250))
imagentk=ImageTk.PhotoImage(imagenSource)
etiquetaImagen=tk.Label(ventana,image=imagentk)
etiquetaImagen.grid(row=0,column=0,padx=30,pady=30)
#cambio a bowser2
imagenCambio=Image.open('C:/Users/Probook/Downloads/Bowser2.png')
imagenCambio=imagenCambio.resize((250,250))
imagenCambioTk=ImageTk.PhotoImage(imagenCambio)
def cambiarImagen():
    etiquetaImagen.configure(image=imagenCambioTk)
botonCambio=tk.Button(ventana,text="   Kart   ",command=cambiarImagen)
#botonCambio.grid(row=1,column=0)
botonCambio.place(x=30,y=310)
#cambio a caparazón
caparazon=Image.open('C:/Users/Probook/Downloads/CaparazónBowser.png')
caparazon=caparazon.resize((250,250))
imagenCambioCTk=ImageTk.PhotoImage(caparazon)
def cambiarImagenC():
    etiquetaImagen.configure(image=imagenCambioCTk)
botonCambioC=tk.Button(ventana,text="Caparazón",command=cambiarImagenC)
#botonCambio.grid(row=1,column=0)
botonCambioC.place(x=80,y=310)
#cambio a Bowsitos
bowsitos=Image.open('C:/Users/Probook/Downloads/VersiónBowser.png')
bowsitos=bowsitos.resize((250,250))
imagenCambioBTk=ImageTk.PhotoImage(bowsitos)
def cambiarImagenB():
    etiquetaImagen.configure(image=imagenCambioBTk)
botonCambioB=tk.Button(ventana,text="Bowsitos ",command=cambiarImagenB)
#botonCambio.grid(row=1,column=0)
botonCambioB.place(x=148,y=310)
#regreso a bowser
imagenCambioBowser=ImageTk.PhotoImage(imagenSource)
def cambiarImagenBowser():
    etiquetaImagen.configure(image=imagenCambioBowser)
botonCambioBowser=tk.Button(ventana,text="  Bowser  ",command=cambiarImagenBowser)
#botonCambio.grid(row=1,column=0)
botonCambioBowser.place(x=210,y=310)

#-------------------Peach---------------------------------------------------------
peach=Image.open('C:/Users/Probook/Downloads/Peach1.png')
peach=peach.resize((250,250))
imagentk2=ImageTk.PhotoImage(peach)
etiquetaImagen2=tk.Label(ventana,image=imagentk2)
etiquetaImagen2.grid(row=0,column=1,padx=30,pady=30)
#cambio a peachKart
peachKart=Image.open('C:/Users/Probook/Downloads/Peach2.png')
peachKart=peachKart.resize((250,250))
imagenCambioPTk2=ImageTk.PhotoImage(peachKart)
def cambiarPeachKart():
    etiquetaImagen2.configure(image=imagenCambioPTk2)
botonPeachKart=tk.Button(ventana,text="Kart",command=cambiarPeachKart)
#botonCambio2.grid(row=1,column=1)
botonPeachKart.place(x=350,y=310)
#cambio a corazón
corazon=Image.open('C:/Users/Probook/Downloads/CorazonPeach.png')
corazon=corazon.resize((250,250))
imagenCambioCorazon=ImageTk.PhotoImage(corazon)
def cambiarCorazon():
    etiquetaImagen2.configure(image=imagenCambioCorazon)
botonCambioCorazon=tk.Button(ventana,text="Corazón",command=cambiarCorazon)
botonCambioCorazon.place(x=382,y=310)
#cambio a peachOro
peachOro=Image.open('C:/Users/Probook/Downloads/VersionPeach.png')
peachOro=peachOro.resize((250,250))
imagenCambioTk2=ImageTk.PhotoImage(peachOro)
def cambiarPeachOro():
    etiquetaImagen2.configure(image=imagenCambioTk2)
botonCambio2=tk.Button(ventana,text="Peach oro",command=cambiarPeachOro)
botonCambio2.place(x=437,y=310)
#regreso peach
imagenCambioPeach=ImageTk.PhotoImage(peach)
def cambiarPeach():
    etiquetaImagen2.configure(image=imagenCambioPeach)
botonCambioPeach=tk.Button(ventana,text="Peach",command=cambiarPeach)
botonCambioPeach.place(x=502,y=310)

#-------------------Yoshi--------------------------------------------------------
imagenSource3=Image.open('C:/Users/Probook/Downloads/Yoshi1.png')
imagenSource3=imagenSource3.resize((250,250))
imagentk3=ImageTk.PhotoImage(imagenSource3)
etiquetaImagen3=tk.Label(ventana,image=imagentk3)
etiquetaImagen3.grid(row=2,column=0,padx=30,pady=30)
#cambio a yoshi2
imagenCambio3=Image.open('C:/Users/Probook/Downloads/Yoshi2.png')
imagenCambio3=imagenCambio3.resize((250,250))
imagenCambioTk3=ImageTk.PhotoImage(imagenCambio3)
def cambiarImagen3():
    etiquetaImagen3.configure(image=imagenCambioTk3)
botonCambio3=tk.Button(ventana,text="Kart",command=cambiarImagen3)
#botonCambio3.grid(row=3,column=0)
botonCambio3.place(x=30,y=610)
#cambio a huevo
huevo=Image.open('C:/Users/Probook/Downloads/HuevoYoshi.png')
huevo=huevo.resize((250,250))
imagenCambioH=ImageTk.PhotoImage(huevo)
def cambiarHuevo():
    etiquetaImagen3.configure(image=imagenCambioH)
botonHuevo=tk.Button(ventana,text="Huevo",command=cambiarHuevo)
#botonCambio3.grid(row=3,column=0)
botonHuevo.place(x=62,y=610)
#cambio a yoshiDorado
dorado=Image.open('C:/Users/Probook/Downloads/VersionYoshi.png')
dorado=dorado.resize((250,250))
imagenCambioD=ImageTk.PhotoImage(dorado)
def cambiarYoshiDorado():
    etiquetaImagen3.configure(image=imagenCambioD)
botonYoshiDorado=tk.Button(ventana,text="Yoshi Reno",command=cambiarYoshiDorado)
#botonCambio3.grid(row=3,column=0)
botonYoshiDorado.place(x=108,y=610)
#regreso yoshi
imagenCambioYoshi=ImageTk.PhotoImage(imagenSource3)
def cambiarYoshi():
    etiquetaImagen3.configure(image=imagenCambioYoshi)
botonYoshi=tk.Button(ventana,text="Yoshi",command=cambiarYoshi)
botonYoshi.place(x=178,y=610)

#-------------------Donkey-------------------------------------------
imagenSource4=Image.open('C:/Users/Probook/Downloads/Donkey1.png')
imagenSource4=imagenSource4.resize((250,250))
imagentk4=ImageTk.PhotoImage(imagenSource4)
etiquetaImagen4=tk.Label(ventana,image=imagentk4)
etiquetaImagen4.grid(row=2,column=1,padx=30,pady=30)
#cambio a Donkey2
imagenCambio4=Image.open('C:/Users/Probook/Downloads/Donkey2.png')
imagenCambio4=imagenCambio4.resize((250,250))
imagenCambioTk4=ImageTk.PhotoImage(imagenCambio4)
def cambiarImagen4():
    etiquetaImagen4.configure(image=imagenCambioTk4)
botonCambio4=tk.Button(ventana,text="Kart",command=cambiarImagen4)
#botonCambio4.grid(row=3,column=1)
botonCambio4.place(x=350,y=610)
#cambio a platano
platano=Image.open('C:/Users/Probook/Downloads/Platanote.png')
platano=platano.resize((250,250))
imagenCambioP=ImageTk.PhotoImage(platano)
def cambiarPlatano():
    etiquetaImagen4.configure(image=imagenCambioP)
botonPlatano=tk.Button(ventana,text="Plátano",command=cambiarPlatano)
#botonCambio4.grid(row=3,column=1)
botonPlatano.place(x=382,y=610)
#cambio a platano
funky=Image.open('C:/Users/Probook/Downloads/VersionDonkey.png')
funky=funky.resize((250,250))
imagenCambioF=ImageTk.PhotoImage(funky)
def cambiarDonkey():
    etiquetaImagen4.configure(image=imagenCambioF)
botonPlatano=tk.Button(ventana,text="Funky Kong",command=cambiarDonkey)
#botonCambio4.grid(row=3,column=1)
botonPlatano.place(x=434,y=610)
#regreso a Donkey
imagenDonkey=ImageTk.PhotoImage(imagenSource4)
def Donkey():
    etiquetaImagen4.configure(image=imagenDonkey)
botonDonkey=tk.Button(ventana,text="Donkey Kong",command=Donkey)
#botonCambio4.grid(row=3,column=1)
botonDonkey.place(x=508,y=610)

ventana.mainloop()
