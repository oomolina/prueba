import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EstudianteService {

  url='http://localhost:8080/api/estudiantes';
  constructor(private http: HttpClient) { }

  getEstudiantes():Observable<any>
  {
    return this.http.get(this.url);
  }

  getUnaEstudiantes(id: string):Observable<any>
  {
    return this.http.get(this.url+'/'+id);
  }

  saveEstudiantes(estudiante: Estudiantes):Observable<any>
  {
    return this.http.post(this.url, estudiante);
  }

  editEstudiante(id:string, estudiante: Estudiantes):Observable<any>
  {
    return this.http.put(this.url+'/'+id, estudiante);
  }

  deleteEstudiante(id:string):Observable<any>
  {
    return this.http.delete(this.url+'/'+id);
  }
}


export interface Estudiantes{
  id:string;
  nombres:string;
  apellidos:string;
  codigo:string;
  reunion:string;
  activo:boolean;
}