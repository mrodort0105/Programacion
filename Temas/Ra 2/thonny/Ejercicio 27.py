import re

data = """
Usuario: perez.juan
Email de contacto: juan.perez@dominio.com
Fecha de acceso: 15-09-2023
Código de cliente: ABC123456
Teléfono de emergencia: 601 234 567
"""

# 1. Patrón para Fechas (DD-MM-YYYY)
patron_fecha = r'\d{2}-\d{2}-\d{4}'
fechas = re.findall(patron_fecha, data)
print(f"Fechas Válidas Encontradas: {fechas}")


# 2. Patrón para Códigos de Cliente (3 letras mayúsculas + 6 dígitos)
patron_codigo = r'[A-Z]{3}\d{6}'
codigos = re.findall(patron_codigo, data)
print(f"Códigos de Cliente Válidos Encontrados: {codigos}")


# 3. Patrón para Teléfonos (XXX XXX XXX)
patron_telefono = r'\d{3}\s\d{3}\s\d{3}'
telefonos = re.findall(patron_telefono, data)
print(f"Teléfonos Válidos Encontrados: {telefonos}")