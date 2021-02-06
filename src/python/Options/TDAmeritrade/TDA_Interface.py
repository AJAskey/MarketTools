import json
import requests


def call_tda(url, params):

    try:
        page = requests.get(url=url, params=params)
        content = json.loads(page.content)
    except:
        content = ""

    return content
