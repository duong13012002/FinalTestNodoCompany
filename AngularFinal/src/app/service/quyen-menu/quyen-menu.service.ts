import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class QuyenMenuService {
  private url = 'http://localhost:8080';
  constructor(private http: HttpClient) { }
  getAllNhomQuyenMenu(): Observable<any> {
    return this.http.get(`${this.url}/quyenmn/all`);
  }
  getNhomQuyenMenuById(id: number): Observable<any> {
    return this.http.get(`${this.url}/quyenmn/${id}`);
  }
  updateRightNhomQuyenMenu(data: any): Observable<Object> {
    return this.http.put(`${this.url}/quyenmn/update`, data);
  }
}
