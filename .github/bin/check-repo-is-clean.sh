#!/usr/bin/env bash

git status --porcelain

if [ -n "$(git status --porcelain)" ]; then
  echo "Generated code is stale, please commit them!"
  exit 1
else
  echo "Generated code up-to-date."
fi