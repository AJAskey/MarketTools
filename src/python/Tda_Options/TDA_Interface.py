import json
import requests


def call_tda(url, params):
    page = requests.get(url=url, params=params)
    content = json.loads(page.content)
    return content
