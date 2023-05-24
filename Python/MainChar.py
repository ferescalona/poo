import tkinter as tk
class MainChar():
    hp=100
    hpMax=100
    nivel=0
    nivelCap=100
    exp=0
    fuerza=10
    expCap=100

    def __init__(self):
        pass

    #def __init__(self,cantidad):
     #   self.hp=self.hp-cantidad
      #  if(self.hp<0):
       #     self.hp=100
        #    self.nivel=self.nivel-1
         #   self.exp=0

    def RecibirDano(self,cantidad):
        self.hp=self.hp-cantidad
        if(self.hp<0):
            self.nivel=self.nivel-1
            self.exp=0


    def RecuperarHp(self,cantidad):
        self.hp=self.hp+cantidad
        if(self.hp>self.hpMax):
            self.hp=self.hpMax
    
    def CambioExp(self,cantidad):
        if(self.exp>self.expCap):
            self.nivel=self.nivel+1
            self.exp=(self.exp+cantidad)-self.expCap
        pass
    
    def Información(self):
        return 'hp: ',self.hp,'exp: ',self.exp,'nivel: ',self.nivel

    pass

personaje=MainChar()

#GUI
ventana=tk.Tk()
ventana.geometry('500x500')
vida=tk.Label(ventana,text='hp'+personaje.hp,font=('Arial',18))
vida.grid(row=0,column=0)


    