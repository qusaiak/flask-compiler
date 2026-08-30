import importlib.util
import os
from pathlib import Path

base = Path(__file__).resolve().parent
spec = importlib.util.spec_from_file_location('runtime_app', base / 'runtime_app.py')
module = importlib.util.module_from_spec(spec)
spec.loader.exec_module(module)
module.app.config['TESTING'] = True
module.app.config['UPLOAD_FOLDER'] = str(base / 'static' / 'uploads')
client = module.app.test_client()

checks = []
def check(name, condition):
    checks.append((name, bool(condition)))

response = client.get('/products')
check('GET /products', response.status_code == 200 and b'Laptop' in response.data)
response = client.get('/add')
check('GET /add', response.status_code == 200)
response = client.get('/product?id=1')
check('GET /product?id=1', response.status_code == 200 and b'Laptop' in response.data)
response = client.get('/edit/1')
check('GET /edit/1', response.status_code == 200)
response = client.post('/edit/1', data={'name': 'Laptop Updated', 'price': '1300', 'details': 'Updated'}, follow_redirects=True)
check('POST /edit/1', response.status_code == 200 and b'Laptop Updated' in response.data)
response = client.post('/add', data={'name': 'Test Product', 'price': '10', 'details': 'Test'}, follow_redirects=True)
check('POST /add', response.status_code == 200 and b'Test Product' in response.data)
response = client.get('/delete?id=3', follow_redirects=True)
check('GET /delete?id=3', response.status_code == 200 and b'Test Product' not in response.data)

for name, ok in checks:
    print(('PASS' if ok else 'FAIL') + '\t' + name)
if not all(ok for _, ok in checks):
    raise SystemExit(1)
