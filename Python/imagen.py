import tkinter as tk
from PIL import Image, ImageTk
ventana = tk.Tk()
ventana.title("Imagenes")
ventana.config(width=900, height=900)

#etiqueta
etiqueta=tk.Label(ventana,text="Se muestran 2 imagenes")
etiqueta.grid(row=0,column=0)

imagenSource=Image.open('C:/Users/Probook/Pictures/Screenshots/Captura de pantalla 2023-04-11 120535.png')
    #reescalar imagen
imagenSource=imagenSource.resize((200,400))

imagentk=ImageTk.PhotoImage(imagenSource)

etiquetaImagen=tk.Label(ventana,image=imagentk)
etiquetaImagen.grid(row=1,column=0)

etiqueta2=tk.Label(ventana,text="Se muestran 2 imagenes")
etiqueta.grid(row=0,column=0)

imagenSource2=Image.open('C:/Users/Probook/Pictures/Screenshots/Captura de pantalla 2023-04-11 120535.png')
    #reescalar imagen
imagenSource2=imagenSource.resize((200,400))

imagentk2=ImageTk.PhotoImage(imagenSource2)

etiquetaImagen2=tk.Label(ventana,image=imagentk)
etiquetaImagen2.grid(row=1,column=1)

imagenCambio=Image.open('C:/Users/Probook/Pictures/Screenshots/Captura de pantalla 2023-03-31 190817.png')
imagenCambio=imagenCambio.resize((200,400))
imagenCambioTk=ImageTk.PhotoImage(imagenCambio)
def cambiarImagen():
    etiquetaImagen.configure(image=imagenCambioTk)
botonCambio=tk.Button(ventana,text="Cambiar",command=cambiarImagen)
botonCambio.grid(row=2,column=0)
ventana.mainloop()


