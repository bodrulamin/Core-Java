

Update : My answer works with github pages, built via jekyll. I use the script tags in markdown which is then processed by jekyll.

Since markdown supports html, one can simply use the <script> tag to embed gist.

Simply copy the embed url of the gist provided by github

enter image description here

..and paste it in you markdown file.

Example : Copy the below and paste in your markdown file.

<script src="https://gist.github.com/nisrulz/11c0d63428b108f10c83.js"></script>