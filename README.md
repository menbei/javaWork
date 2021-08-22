■目的
Javaの学習用リポジトリ

■トラブルシューティング
・GitHubでパスワード認証廃止による認証エラーが出た場合
https://qiita.com/atsymd/items/a1ff5a496b78f47ce80e

・コマンド
$ git remote remove origin
$ git remote add origin https://<トークン>@github.com/menbei/javaWork.git
