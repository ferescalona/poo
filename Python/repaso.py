class Animal():
    vivo=True

    def Animal():
        pass

    def _init_(self,vivo):
        self.vivo=vivo
        pass

    def _init_(self):
        pass

    def Respirar():
        print("El animal esta respirando")
pass

class Perro(Animal):
    nombre="firulais"

    def _init_(self,vivo):
        pass

    def Ladrar(self):
        print("woof woff")
pass

#nombre del objeto= Constructor(atributos)
a=Animal()
print(a.vivo)
p=Perro()
p.Ladrar