import requests

api = 'http://localhost:8081/song'


def test_song_empty_get():
    s = requests.Session()
    id = '8c34c25b-b4a1-477a-a938-d6ad10442c98'
    response = s.get(f'{api}ahaha/{id}')
    assert response.status_code == 200

def test_song_save_and_get():
    s = requests.Session()
    parameters = "?title=Daydreamer&broken=8c34c25b-b4a1-477a-a938-d6ad10442c98"
    response = s.post(f'{api}/{parameters}')
    assert response.status_code == 200
    assert response.json().get('title') == 'Daydreamer'
    createdSongId = response.json().get('id')
    responseSong = s.get(f'{api}/{createdSongId}')
    assert responseSong.status_code == 200
    assert responseSong.json().get('title') == 'Daydreamer'