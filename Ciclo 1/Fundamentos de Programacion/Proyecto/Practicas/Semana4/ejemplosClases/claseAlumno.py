class Persona:
    def __init__(self, nombre, identificacion):

        self.nombre = nombre
        self.identificacion = identificacion

    def get_nombre(self):
        return self.nombre

    def get_identificacion(self):
        return self.identificacion


class Alumno(Persona):
    def __init__(self, nombre, identificacion, notas):

        Persona.__init__(self, nombre, identificacion)
        self.notas = notas
    
    def get_notas(self):
        return self.notas

    def resultadosAlumno(self):
        if self.notas < 3:
            print('El estudiante se echo la materia :(')
        else:
            print('Si se pudo, Burro, si se pudo :)')